import java.util.Random;

public class Dice 
{
	int sides;
	
	Dice(int sides)
	{
		//self.sides = sides
		this.sides = sides;
	}
	
	int roll()
	{
		Random r = new Random();
		// add 1 because there is no 0 on a dice
		return r.nextInt(this.sides)+ 1; 
	}
}
