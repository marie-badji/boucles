public class Exo1_2 {

    public static void main (String[] args)

    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String pre= args[2];

        Exo1_3.salutation();
        System.out.println("La difference entre "+ num1 + " et "+ num2+ " est "+ Exo1_3.sous(num1, num2)+ " et l'operation a ete effectuee par " + Exo1_3.effectuee(pre));

    }
    
}
