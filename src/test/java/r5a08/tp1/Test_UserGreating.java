package r5a08.tp1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_UserGreating {
    @Test
    public void test_formatGreeting(){
                                        // SANS AAA
       // UserGreating Class_A_Tester = new UserGreating();
        //Assertions.assertEquals("Bonjour Sunraku", Class_A_Tester.formatGreeting("Sunraku"));

                                        // AVEC AAA
        // Arrange
        UserGreating Classe_A_Tester = new UserGreating();
        String nom = "Sunraku";  // L'argument passé à la méthode
        String expectedGreeting = "Bonjour Sunraku";  // Ce que l'on attend comme résultat

        // Act
        String actualGreeting = Classe_A_Tester.formatGreeting(nom);

        // Assert
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    public void test_formatGreeting_withNonEmptyName() {
        // Arrange
        String nom = "";

        // Act et Assert
        Assertions.assertThat(nom).isEmpty();
    }

}
