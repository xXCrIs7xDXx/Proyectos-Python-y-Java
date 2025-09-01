def f(n):
    if n==1 or n==2:
        return 1
    return f(n-1)+f(n-2)
#print (f(int(input())))

def f2(n,a,b):
    if n<0:
        return 0
    if n==a:
        return a
    if n==b:
        return b
    return f2(n-1,a,b)+f2(n-2,a,b)

a,b,n=0,1,5
print (f2(a,b,n))

a,pos=map(int,input().split())
a=a#10
mask=1<<(pos-1) #100
print(a|mask)