import socket
from datetime import datetime

def days_to_end_of_year(date_str):
    date = datetime.strptime(date_str, '%Y-%m-%d')
    end_of_year = datetime(date.year, 12, 31)
    return (end_of_year - date).days

server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.bind((socket.gethostname(), 5201))
server_socket.listen(5)

while True:
    client_socket, addr = server_socket.accept()
    print(f"Conexión desde {addr} establecida!")

    date_str = client_socket.recv(1024).decode('utf-8')
    if date_str == '9999':
        break

    days = days_to_end_of_year(date_str)
    client_socket.send(str(days).encode('utf-8'))

client_socket.close()