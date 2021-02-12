import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		Dice d6 = new Dice(6);
		Dice d10 = new Dice(10);
		
		System.out.println(d6.roll());
		System.out.println(d10.roll());
		
		for(int i =0; i < 5; i ++) 
		{
			System.out.println(d6.roll());
			System.out.println(d10.roll());
		}

	}

}
