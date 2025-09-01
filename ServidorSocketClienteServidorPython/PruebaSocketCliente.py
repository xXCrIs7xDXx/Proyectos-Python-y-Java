import socket

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((socket.gethostname(),5201))

fecha = input("Ingresa la fecha en formato 'YYYY-MM-DD': ")
s.send(fecha.encode('utf-8'))

msg = s.recv(1024)
print ('Mensaje del servidor:', msg.decode('utf-8'))

s.close()