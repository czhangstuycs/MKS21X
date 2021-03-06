public class Teacher extends Actor{

    private int Awesomeness;

    public Teacher(String name,int str,int agi,int intel,int health)
    {
	super(name,str,agi,intel,health);
	Awesomeness = 50;
    }

    public Teacher(String name)
    {
	this(name,10,15,30,35);
    }

    public Teacher()
    {
	this("Sensei",10,15,30,35);
    }

    public String attack(Actor other)
    {
	other.takeDamage(3);
	return getName()+" suspended "+other.getName();
    }

    public String specialAttack(Actor other)
    {
	if (Awesomeness >= 10)
	    {
		Awesomeness -= 10;
	        other.takeDamage(12);
		return getName()+" expelled "+ other.getName();
	    }
	return "Special Attack failed!";

    }

    public int getResource()
    {
	return Awesomeness;
    }

    public String getResourceName()
    {
	return "Awesomeness";
    }

    public String defend(){

        if (Awesomeness < 50)
	    {
		Awesomeness += 5;
	    }
	return 	super.defend();
    }

}
