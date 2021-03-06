
import java.util.Scanner;

public class Game
{
    public static void main(String[] args)
    {
	Actor A;
	String message,result;
	message = "Choose a class: Teacher, Nerd, Bully [T/N/B]";
	Scanner input = new Scanner(System.in);

        do{
            System.out.println(message);
            result = input.next();
            message = " Choose a valid input [T/N/B]";

        }while(!(result.equals("T") || result.equals("N") || result.equals("B")));

        //result is always W or B, so if/else is ok\
	//	System.out.println(result + " x");   
        if(result.equals("N"))
	    {
	        A = new Nerd();
	    }

	if(result.equals("B"))
	    {
	        A = new Bully();
	    }
	if(result.equals("T"))
	    {
	        A = new Teacher();
	    }




	Actor opponent = new Nerd();
	//	if (result.equals("T") || result.equals("N") || result.equals("B"))
	// {
	System.out.println("Combat Start!");

	do{
	    message = "Make your move: [Attack/SpecialAttack/Defend/Quit]";
	    //	Scanner input = new Scanner(System.in);
	    do{
		System.out.print(message);
		result = input.next();
		message = " Choose a valid input: [Attack/SpecialAttack/Defend/Quit]";
	    }while(!(result.equals("Attack") || result.equals("SpecialAttack") || result.equals("Defend") || result.equals("Quit")));

	    if (result.equals("Attack"))
		{
		    System.out.println(A.attack(opponent));
		    System.out.println(opponent.attack(A));
		}

	    if (result.equals("SpecialAttack"))
		{
		    System.out.println(A.specialAttack(opponent));
		    System.out.println(opponent.specialAttack(A));
		}

	    if (result.equals("Defend"))
		{
		    System.out.println(A.defend());
		    System.out.println(opponent.defend());
		}

	}
	while(! (A.getHealth() < 0 || result.equals("Quit")));

	System.out.println("Combat Over");
	
	if (A.getHealth() > opponent.getHealth())
	    {
		System.out.println(A.getName() + " won!");
	    }

	if (A.getHealth() < opponent.getHealth())
            {
		System.out.println(opponent.getName() + " won!");
            }

	if (A.getHealth() == opponent.getHealth())
            {
		System.out.println("Draw!");
            }

    }


}
