package co.simplon.prairie;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

/**
 * Classe de tests de la classe FizzBuzz
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void init() {
        fizzBuzz = new FizzBuzz();
    }
 
    @Test
    public void la_correspondance_de_0_est_0() {
        assertEquals(
                "La correspondance pour 0 doit être 0.",
                "0",
                fizzBuzz.determinerCorrespondance(0)
        );
    }

    @Test
    public void la_correspondance_de_3_est_Fizz() {
        assertEquals(
                "La correspondance pour 3 doit être Fizz.",
                "Fizz",
                fizzBuzz.determinerCorrespondance(3)
        );
    }

    @Test
    public void la_correspondance_de_5_est_Buzz() {
        assertEquals(
                "La correspondance pour 5 doit être Buzz.",
                "Buzz",
                fizzBuzz.determinerCorrespondance(5)
        );
    }

    @Test
    public void la_correspondance_de_11_est_11() {
        assertEquals(
                "La correspondance pour 11 doit être 11.",
                "11",
                fizzBuzz.determinerCorrespondance(11)
        );
    }
    
    @Test
    public void la_correspondance_de_15_est_FizzBuzz() {
        assertEquals(
                "La correspondance pour 11 doit être FizzBuzz.",
                "FizzBuzz",
                fizzBuzz.determinerCorrespondance(15)
        );
    }
}
