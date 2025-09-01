#Cristian J Velasco Conde
#13759085 LP

def ContarDigitos(n):
    cont = 0
    cont += 1
    if(n==0):
        return 0
    else:
        return(cont+ContarDigitos(n//10))

#===== MAIN ======
print("Ingrese un numero: ")
n=int(input())
print("La Cantidad de Digitos de ",n," es: ",ContarDigitos(n))