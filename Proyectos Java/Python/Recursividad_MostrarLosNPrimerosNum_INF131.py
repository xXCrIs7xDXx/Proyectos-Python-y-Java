#Cristian J. Velasco Conde
#13759085

def Mostrar_N_Numeros(n):
    if(n>0):
        Mostrar_N_Numeros(n-1)
        print(n, end=" ")
        
print("Ingresa un Numero: ")
n=int(input())
print("Los numeros antes de ",n,"son: ")
Mostrar_N_Numeros(n-1)