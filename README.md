#  Eyala Seraphin Hauméa r5a8_junit_tests

## Dépôt pour les séances de tavail pratique pour la ressource R5A08 qualité de développement

## qualiteDev 
### 3.1
Vous devrez préalablement supprimer le dossier .git qui se trouve dans le projet que vous avez cloné. Pourquoi ?<br>
Car je veux maintenant transformer ce projet en un projet indépendant sans aucune référence au dépôt d'origine

 Observez les dépendances qui se trouve dans le fichier build.gradle, à quoi correspondent-t-elles ? <br>
 Ce  fichier contient les éléments que j'ai besoin pour mon projet comme les dépendances pour utiliser Junit ou encore les depots ou on va aller chercher ces dependances.

 ## Développement des test unitaires 
 ### Question 1
 public class UserGreating {
    public String formatGreeting(String nom){
        return "Bonjour" + nom;
    }
}

### Question 2

public class Test_UserGreating 
{
    @Test
    
    public void test_formatGreeting(){
        
        // Arrange
        UserGreating Classe_A_Tester = new UserGreating();
        String nom = "Sunraku";  // L'argument passé à la méthode
        String expectedGreeting = "Bonjour Sunraku";  // Ce que l'on attend comme résultat

        // Act
        String actualGreeting = Classe_A_Tester.formatGreeting(nom);

        // Assert
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
}

### Question 3 

 
