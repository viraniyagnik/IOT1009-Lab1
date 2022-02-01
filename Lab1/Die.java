//Name:Yagnik Virani
//Student number: A00227162
//course: Computer programming IoT(CPIN)

//Die class with constructors
public class Die {

    //variable for name, sides and sideup
    private String name;
    private int NumberofSides;
    private int CurrentsideUp;

    //constructor without argument, Default name: "d6"; default number of sides: 6; random side up generated from the roll method
    public Die()
    {
        name = "d6";
        NumberofSides = 6;
        roll();
    }

    //constructor with one argument, Number of sides is the parameter. Default type/name: "d{number of sides}" random side up generated from the roll method
    public Die(int NumberofSides)
    {
        this.NumberofSides = NumberofSides;
        name = "d" + NumberofSides;
        roll();
    }

    //constructor with two arguments, Both the number of sides and the type are parameters; random side up generated from the roll method
    public Die(int NumberofSides, int CurrentsideUp)
    {
        this.NumberofSides = NumberofSides;
        name = "d" + NumberofSides;
        this.CurrentsideUp = CurrentsideUp;
    }

    //For random value
    public void roll()
    {
        CurrentsideUp = (int)((Math.random() * NumberofSides) + 1);
        
    }

    //To get name
    public String getname()
    {
        return name;
    }

    //To get sides
    public int getNumberofSides()
    {
        return NumberofSides;
    }

    //To get current sideup
    public int getCurrentsideUp()
    {
        return CurrentsideUp;
    }

    // To set number of sides
    public void setNumberofSides(int NumberofSides)
    {
        this.NumberofSides = NumberofSides;
        name = "d6";
    }

    //to set current side up
    public void setCurrentsideUp(int CurrentsideUp) {
        this.CurrentsideUp = CurrentsideUp;
    }
}
