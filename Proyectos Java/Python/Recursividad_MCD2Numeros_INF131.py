#Cristian J. Velasco Conde
#13759085
def MCD(x,y):
    if(y==0):
        return x
    else:
        return MCD(y,x%y)
    
#======= MAIN =======
print("Ingrese 2 numeros: ")
x=int(input())
y=int(input())
print("El MCD de ",x," y ",y," es ",MCD(x, y))