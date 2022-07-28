# Tarea3_State_UPS

Usando el patrón State tomando como base el ejemplo del servidor, implementar un apagado seguro Este funcionaria de la siguiente
manera:
## 
 Una vez establecido no permite enviar más mensajes y el servidor no debe apagarse hasta que todos los mensajes que entraron (antes de establecer el estado) sean procesados Una vez que el servidor se apague cambiar su estado al de Apagado