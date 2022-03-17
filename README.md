"# WorkGradleYuxi" 
### Projecto de Automatizacion en Colaboracion con Yuxi ### 
### Selenium, Gradle, Cucumber, Java ### 

### Pasos para la configuracion: 

 
1.- Debemos ser administradores de nuestros equipos Yuxi, para esto debemos hablar con el equipo de HelpDesk(Soporte), y que nos ayuden configurando todos los permisos necesarios para que nuestros usuarios sean administradores. 

2.- Visual Studio Code Community, dependiendo de nuestro sistema operativo debemos ir a la siguiente ruta y descargar la version que se adapte a cada maquina. https://code.visualstudio.com/download 

3.- Instalar Java JDK 15, desde la siguiente URL podran descargar el ejecutable  (.exe),  esto es necesario para trabajar con java, una vez descargado solo se debe ejecutar y validar que exista dentro de las variables de ambientes de windows(Paso 4). . https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html 

4.- Crear y validar configuracion de la variable JAVA_HOME para windows o Mac. 

Para Windows  debemos seguir los pasos descritos en la siguiente URL -->JAVA_HOME_CONFIG 

Para Mac, una vez instalado el JDK relacionado al sistema operativo debemos seguir los pasos cualquiera de las siguientes rutas:  https://sintaxispragmatica.wordpress.com/2014/04/07/establecer-la-variable-java_home-en-mac-osx/ 

Or 
https://hecthormedina.wordpress.com/2013/10/27/como-configurar-la-variable-de-entorno-java_home-en-mac-os-x-y-no-morir-en-el-intento/ 

 
5- Descargar y configurar Gradle:  

* Pasos Windows--> 
Descargar gradle de la pagina oficial y buscar la version mas reciente > https://gradle.org/releases/ 

* Crear una nueva carpeta en Disco "C:" con el nombre "Gradle" y descomprimen el archivo zip de gradle alli.  

* Luego, abriendo el Panel de Control -> Sistema -> Configuración avanzada del sistema -> Variables de entorno > Variables del Sistema. 

* Finalmente, Añadimos la ruta "C:\gradle\bin" a la variable PATH 

 
Pasos Mac--> 

Con Homebrew instalado vamos a ejecutar, en la terminal: brew install gradle. Listo! 


************************** 
Nota: Hasta este paso va la configuracion basica de nuestro entornos,  si necesitan mas ayuda se pueden comunicar por chat para ayudarlos a configurar lo necesario.  
******************************** 


## Dependencias para archivo build.gradle: 

implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.1.2' 

implementation group: 'io.cucumber', name: 'cucumber-java', version: '4.2.0' 

testImplementation group: 'io.cucumber', name: 'cucumber-junit', version: '4.2.0' 


## Comandos Gradle 

gradle clean 

gradle build 


## Extensiones para configurar cucumber, Java desde visual studio code: 

Cucumber (Gherkin) Full Support 

Snippets and Syntax Highlight for Gherkin (Cucumber) 

Extension Pack for Java v0.22.0 