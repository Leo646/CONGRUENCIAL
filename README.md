                                                       INTRODUCCIÓN
                                                
   En el siguiente documento, se hará unas descripción del funcionamiento del programa "Congruencial Multiplicativo" utilizando como lenguaje  de programación Java.
   Se utilizarán variables que permitan almacenar los valores que se introducen a través de teclado, como variables que permitan almacenar los resultados que se generan a partir del programa. Se emplearan condiciones If() que permitan obtener estos resultados de forma correcta.
   
                                                       DESARROLLO

   El generador Congruencial Multiplicativo determina el próximo numero pseudoaleatorio  a partir del ultimo numero generado, de acuerdo a la siguiente relación de recurrencia: 
  
   ![image](https://user-images.githubusercontent.com/33529768/58386937-640adc00-7fcc-11e9-8726-09571ea6ffc8.png)
   
   Para el desarrollo del programa es necesario seguir ciertos pasos y ciertas condiciones. Como primer paso, es necesario declara las variables que se van a utilizar para almacenar los datos introducidos a través de teclado y también para almacenar dichos resultados a través de una clase de tipo static Void.
   
   
![image](https://user-images.githubusercontent.com/33529768/58386998-8b15dd80-7fcd-11e9-932f-608711c867d1.png)

Como segundo caso se emplean las condiciones if() para el buen funcionamiento del programa. Se van a utilizar tres condiciones If().En en primer if() se establece que p debe estar entre los siguientes valores {3,11,13,19,21,27,29,37,53,59,61, 67,69,77,83,91 }, si se cumple esto el valor de a de determinara a través de la siguiente formula:

![image](https://user-images.githubusercontent.com/33529768/58387478-5e18f900-7fd4-11e9-93fa-3640c1e1249b.png)

si se cumple lo mencionado anteriormente, pasamos al siguiente if() donde el valor de la semilla,X0 debe ser un numero impar no divisible para 2 o 5, si  esto se, cumple pasamos al ultimo if() que determinara si la semilla es impar o no. Si la semilla es impar , se utiliza la formula la siguiente:

![image](https://user-images.githubusercontent.com/33529768/58386937-640adc00-7fcc-11e9-8726-09571ea6ffc8.png)

formula para generar los numero Pseudoaleatorios, caso contrario se volver a introducr los datos para generar los numero pseudoaleatorios. Visualizando el código quedaría de la siguiente manera.

![image](https://user-images.githubusercontent.com/33529768/58387325-725bf680-7fd2-11e9-9aa0-e2af683cc450.png)

Por ultimo solo queda probar el programa ingresando los siguientes datos que se visualizan en la imagen.

![image](https://user-images.githubusercontent.com/33529768/58387352-e5656d00-7fd2-11e9-888a-a2f38daf0ed7.png)

Con los datos ingresados se produce la siguiente cadena de numeros pseudoaleatorios

![image](https://user-images.githubusercontent.com/33529768/58387462-0b3f4180-7fd4-11e9-9eb1-3c8cfa0ba5d4.png)
