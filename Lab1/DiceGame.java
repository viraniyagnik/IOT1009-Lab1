//Name:Yagnik Virani
//Student number: A00227162
//course: Computer programming IoT(CPIN)
public class DiceGame
{

    public static void main(String[] args)
    {

        //Create dices based on require output
        System.out.println("Creating a default d6...");
        Die d6 = new Die();
        System.out.println("Creating a d20...");
        Die d20 = new Die(20);
        System.out.println("Creating percentile die (a special d10)...");
        Die d10 = new Die(10);

        //Shows which side up before roll method in each dice
        System.out.println("The current side up for " + d6.getname() + " is " + d6.getCurrentsideUp());
        System.out.println("The current side up for " + d20.getname() + " is " + d20.getCurrentsideUp());
        System.out.println("The current side up for Percentile  is " + d10.getCurrentsideUp());

        //Test roll method
        System.out.println("\nTesting the roll method\n");

        //roll d6 dice and shows it's new value
        System.out.println("Rolling the d6...");
        d6.roll();
        System.out.println("The new value is " + d6.getCurrentsideUp());

          //roll d20 dice and shows it's new value
        System.out.println("Rolling the d20...");
        d20.roll();
        System.out.println("The new value is " + d20.getCurrentsideUp());

          //roll d10 dice and shows it's new value
        System.out.println("Rolling the Percentile...");
        d10.roll();
        System.out.println("The new value is " + d10.getCurrentsideUp());

        //set the highest dice value
        System.out.println("\nSetting the d20 to show 20...");
        d20.setCurrentsideUp(20);
        System.out.println("The side up is now " + d20.getCurrentsideUp() + ". Finally.");


    

    }
}
