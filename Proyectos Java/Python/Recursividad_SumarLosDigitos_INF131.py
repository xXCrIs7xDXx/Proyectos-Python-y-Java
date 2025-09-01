#Cristian J. Velasco Conde
#13759085 LP
#=====SUMA DE DIGITOS=====
def SumarLosDigitos(n):
    if(n==0):
        return 0
    else:
        return n%10 + SumarLosDigitos(n // 10)

#=======Main==========
print("Ingrese un numero: ")
n=int(input())
print("La suma de los digitos de ",n," es: ",SumarLosDigitos(n))