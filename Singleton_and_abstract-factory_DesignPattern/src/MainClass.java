import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	
	//Creating a factory object
	CreateFactory factory = new CreateFactory();
	
	//Date, time or quit object 
	DTQ dtq = null;
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Want the current Date(D), Time(T) or Quit the Program (Q) ?");
	if (userInput.hasNextLine()) {
		String req = userInput.nextLine();
		dtq = factory.showdtq(req);
		
		if (dtq != null) {
			doStuff(dtq);
			
		} else System.out.print("Enter D, T or Q next time");
		
	}
			
	
}
}
