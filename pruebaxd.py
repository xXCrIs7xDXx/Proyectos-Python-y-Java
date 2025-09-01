def iniciar_seguimiento(chica):
    datos_chica = {}
    datos_chica['hora_llegada'] = obtener_hora_llegada(chica)
    datos_chica['itinerario'] = obtener_itinerario(chica)
    datos_chica['datos_personales'] = obtener_datos_personales(chica)
    
    # Fin del seguimiento
    return datos_chica

# Funciones auxiliares para obtener información de la chica
def obtener_hora_llegada(chica):
    return "8:00 AM"
def obtener_itinerario(chica):
    return ["clase 111", "clase 112", "almuerzo", "clase 113"]
def obtener_datos_personales(chica):
    return {"nombre": "Ana"}

chica = "Ana"
datos = iniciar_seguimiento(chica)
print(datos) 
