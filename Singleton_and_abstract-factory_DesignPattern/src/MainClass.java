import java.util.Scanner;

public class MainClass {

	private static Scanner input;

	public static void Main(String [] args) {
		DateFactory D = DateFactory.getInstance(); //created Date Object
		TimeFactory T = TimeFactory.getInstance(); //created Time Object
		
		System.out.println("Select Format as 1 or 2" + "\n" + "Format 1 : MM/DD/YYYY; HH:MM:SS" + "\n" + "Fromat 2: DD-MM-YYYY; SS,MM,HH");
		input = new Scanner(System.in);
		
		int format = input.nextInt();
		D.setFormat(format);
		T.setFormat(format);
		
		while(true) {
			System.out.println("Select D for Date" + "\n" + "Select T for Time" + "\n" + "Select Q to Quit the program");
			String DTfactory = input.nextLine();
			
			if(DTfactory.equals("D")) {
				System.out.print("Date:" +D.getDate());
			}else if(DTfactory.equals("T")) {
				System.out.print("Time:" +T.getTime());
			}else if (DTfactory.equals("Q")) {
				System.out.print("End of program, run again to try");
				break;
			}else {
				System.out.print("Invalid Entry");
			}
		}
		
	}
}
