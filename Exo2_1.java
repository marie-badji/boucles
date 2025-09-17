import java.util.Random;
import java.util.Scanner;

public class Exo2_1 {

    public static void main(String[] args) {    

        System.out.println("1:Guess\r\n" + 
                        "2:Afficher les best results\r\n" + 
                        "3: table de Mutiplication\r\n" +
                        "0: quitter");
        Scanner myObj = new Scanner(System.in);  
        int option;
        option = myObj.nextInt();

       switch (option) {
        case 1:
            guessMyNumberGame();
            break;

        case 2:
            System.out.println("Fonctionnalite pas encore disponible ");
            break;

        case 3: 
            System.out.println("Bienvenue! Veuillez entrez un nombre entre 1 et 10");
            int chif = myObj.nextInt();
            multi( chif);
            break;

        case 0: 
            break;
       }
            
        
    }

    public static int hazard()
    {
        Random random = new Random();
        return random.nextInt(100);

    }

    public static void multi (int chif)
    {
        

        System.out.println("La table de multiplication de" + chif);
        for (int i=1; i<=10; i++)
        {
            System.out.println(chif +" x " + i + " = " + chif*i);
        }
    }

    public static void guessMyNumberGame()
    {
        Scanner myObj = new Scanner(System.in);  

        int nbre;
        System.out.println("Bienvenue! Veuillez entrez un nombre entre 1 et 100");
        do {
        
            nbre = myObj.nextInt();
            
            int alea = hazard();
                
                while (alea != nbre) {
                    if (nbre==0)
                    {
                    break;
                    }
                    else if (nbre> alea)
                    {
                        System.out.println("Oups, le nombre est superieur");
                    }
                    else 
                    {
                        System.out.println("Oups, le nombre est inferieur");
                    }   
                nbre = myObj.nextInt();    
                }
                
            if (nbre !=0 )
                    {
                        System.out.println("Felicitations!! "+ nbre + " est le bon nombre");
                         System.out.println("Nouveau Jeu ou taper 0 si vous voulez quitter mon merveilleux jeu!!");

                    }   
                    
                  

            } while (nbre!=0) ;
           
    }
    

    

}
