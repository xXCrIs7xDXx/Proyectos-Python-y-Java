n=3
cad=["a","b","c"]
for i in range (1,2**n): 
    for j in range (n):
        res=(1<<j)&i
        if (res>0) :
            print(cad[j],end=" ")
    print()



