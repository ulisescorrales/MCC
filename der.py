
def diferenciaAtras(f0,f1):
	h=f1-f0
	res=(f1-f0)/h
	return res
def diferenciaAdelante(f1,f2):
	h=f2-f1
	res=(f2-f1)/h
	return res
def diferenciaCentral(f0,f1,f2):
#La distancia entre fs es la misma
	h=f2-f1
	res=(f2-f0)/(2*h)
print(str(diferenciaAtras(2,1)))
