public class Main
{
    public static void main(String[] args)
    {
        String partyAffiliation = "D";

        System.out.println("What political party do you identify with? Enter D, R, or I.");

        if (partyAffiliation.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (partyAffiliation.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if (partyAffiliation.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person!");
        }
        else
        {
            System.out.println("You identify with another political party.");
        }
    }
}