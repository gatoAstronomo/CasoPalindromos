package proyect;

public class CasoPalindromos{
    public static boolean esPalindromo(String cadena){
        cadena = cadena.toLowerCase().replaceAll("\\s","");

        StringBuilder invertida = new StringBuilder(cadena).reverse();
        return  cadena.contentEquals(invertida);
    }
}

