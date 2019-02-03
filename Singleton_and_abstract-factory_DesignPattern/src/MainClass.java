import java.util.Scanner;

public class MainClass {

	private static Scanner input;

	public static void main(String []args) {
		DateFactory D = DateFactory.getInstance(); //created Date Object
		TimeFactory T = TimeFactory.getInstance(); //created Time Object
		
		System.out.println("Select Format as 1 or 2 \n  Format 1 : MM/DD/YYYY; HH:MM:SS  \n  Format 2: DD-MM-YYYY; SS,MM,HH");
		input = new Scanner(System.in);
		
		int format = input.nextInt();
		D.setFormat(format);
		T.setFormat(format);
		
		while(true) {
			System.out.println("Select D for Date \n Select T for Time \n Select Q to Quit the program");
			String DTfactory = input.nextLine();
			
			if(DTfactory.equals("D")) {
				System.out.println("Date:" +D.getDate());
			}else if(DTfactory.equals("T")) {
				System.out.println("Time:" +T.getTime());
			}else if (DTfactory.equals("Q")) {
				System.out.println("End of program, run again to try");
				break;
			}
		}
		
	}
}
