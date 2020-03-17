# Patrones Arquitecturales

## Link a tutorial en video https://drive.google.com/open?id=1-BLGeyFwtMdvFfgv9TWP7c0_i8PDInpO
  
 ## Sitio estático con S3
 
 1. Desde la consola S3 en AWS se crea un nuevo bucket
 
![Alt text](img/1.PNG)

 2. Le ponemos nombre al bucket.
  
 ![Alt text](img/2.PNG)
 
 3. Deseleccionamos la opción de Bloquear Acceso Publico
 
![Alt text](img/3.PNG)

 4. Se suben los archivos de la página web.

![Alt text](img/4.PNG)
 
 5. Activamos en propiedades el alojamiento de sitios web estaticos.

![Alt text](img/5.PNG)
 
 6. En politicas de bucket ponemos esto:

![Alt text](img/6.PNG)
 
 7. Ya estaria creado el sitio estático.

![Alt text](img/7.PNG)
 
 
## VPC de seguridad

1. Desde la consola de EC2 en security group le damos a crear uno nuevo. Le añadimos un nombre y descripción.

![Alt text](img/8.PNG)

2. Le añadimos las reglas de entrada que queramos.

![Alt text](img/9.PNG)


## Base de Datos
1. Desde la consola en RDS le damos a crear una nueva base de datos.

![Alt text](img/10.PNG)

2. Le damos a crear de forma estandar.

![Alt text](img/11.PNG)

3. Escogemos el motor de base de datos.

![Alt text](img/12.PNG)

4. Escogemos la opción gratuita.

![Alt text](img/13.PNG)

5. Le asignamos las credenciales correspondientes al usuario maestro.

![Alt text](img/14.PNG)

6. Le damos acceso público y le asignamos el grupo de seguridad creado.

![Alt text](img/15.PNG)

7. Le damos un nombre a la base de datos inicial.

![Alt text](img/16.PNG)
