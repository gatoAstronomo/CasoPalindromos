package proyect;

public class CasoPalindromos{
    public static boolean esPalindromo(String cadena){
        StringBuilder invertida = new StringBuilder(cadena).reverse();
        return  cadena.contentEquals(invertida);
    }
}

