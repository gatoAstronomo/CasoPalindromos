 Caso Palíndromos - Pruebas Unitarias
======================================
Arturo Rivas López

¿Cómo funciona el código JavaScript?
--------------------------------------
```js
function esPalindromo(cadena) {
    let resultado = "";
    resultado = cadena.split('').reverse().join('');
    return cadena === resultado;
}
```
- La funcion recibe un parametro cadena  
- Inicializa la varibale resultado como un string vacio  
- Suponiendo que cadena es de tipo string, split('') transforma a cadena en un array de caracteres, invierte el array 
con el metodo reverse y vuelve a unirlo en un string con join('') y le asigna este valor a la variable resultado  
- Retorna True si las cadenas son iguales y False si son distintas  

Version equivalente en Java
---------- 
```java
public static boolean esPalindromo(String cadena){
    StringBuilder invertida = new StringBuilder(cadena).reverse();
    return  cadena.contentEquals(invertida);
    }
```

¿Qué consideraciones tomaron en cuenta?
----------------------------------------
Si las palabra tienen letras en mayus o minus podria no funcionar, como tambien por los espacios en blanco

¿Qué mejoró en su método?
-------------------------
Se le hace una "limpieza" al string eliminando todos los espacios en blanco y transformando todas las letras a lowercase
, posteriormente se invierte y compara
```java
public class CasoPalindromos{
    public static boolean esPalindromo(String cadena){
        cadena = cadena.toLowerCase().replaceAll("\\s","");

        StringBuilder invertida = new StringBuilder(cadena).reverse();
        return  cadena.contentEquals(invertida);
    }
}
```

¿Qué rol jugaron las pruebas en mejorar su código?
-----------------------------------------------------
Lograr identificar el problema logíco recién mencionado para su posterior corrección