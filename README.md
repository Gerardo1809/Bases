
# Airlogics 
### Indicaciones (Seguir el orden)
##### Crear en oracle 
``
create user airlogics identified by airlogics;
grant connect,resource to airlogics;
``
se crea un usuario y contraseña de la empresa
luego hacer la conexion con el mismo nombre airlogics

##### Instalar en maven
 Entrar en carpeta objdc ejecutar el siguiente comando.
``
mvn install:install-file -Dfile=ojdbc7.jar -DgroupId=com.oracle 
-DartifactId=ojdbc7 -Dversion=12.1.0 -Dpackaging=jar
``
El anterior comando instalara el conecto de oracle-xe de manera local.

##### Instalar dependencias desde eclipse o desde terminal.

##### Puertos [Eclipse STL]
La aplicacion corre por defecto en el puerto ``8080`` pero se puede cambiar por default en el archivo properties.

###### Si se corre desde otro IDE se necesita embeber el servidor tomcat.
##### Comandos de uso general.
* ``mvn install`` => instala dependecias mvn sin necesidad de eclipse
* ``mvn spring-boot:run``=> corre el proyecto spring boot