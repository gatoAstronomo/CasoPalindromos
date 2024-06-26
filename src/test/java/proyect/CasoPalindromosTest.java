package proyect;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CasoPalindromosTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void esPalindromo() {
        assertTrue(CasoPalindromos.esPalindromo("La tele letal"));
        assertTrue(CasoPalindromos.esPalindromo("Anita lava la tina"));
        assertTrue(CasoPalindromos.esPalindromo("ana"));
        assertTrue(CasoPalindromos.esPalindromo("12344321"));
        assertTrue(CasoPalindromos.esPalindromo(""));
        assertFalse(CasoPalindromos.esPalindromo("Esto No es un palindromo"));
        assertTrue(CasoPalindromos.esPalindromo(""));
        assertTrue(CasoPalindromos.esPalindromo("        "));
    }
}