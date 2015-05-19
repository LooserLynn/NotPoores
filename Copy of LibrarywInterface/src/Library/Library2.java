package Library;
import java.util.Scanner;

public class Library2 {
	static int minCustomers = 100;
    static Book[] books = new Book[10];
	
	//Create a scanner object each for text and numbers
	private static Scanner tInput = new Scanner(System.in);
	private static Scanner nInput = new Scanner(System.in); 
	private static Scanner cInput = new Scanner(System.in);
	private static Scanner check = new Scanner(System.in);
	private static Scanner wantto = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Add the books
		addBooks();
		
		
		for (int i = 0; i < books.length; i++ )
		{
			System.out.println(books[i].getTitle() + ", by " + books[i].getAuthor() + ", call num: " + books[i].getCallNumber());
			
		}
		//check out
		chooseBook();
	/*	
		do 
		{
		System.out.println("What is the maximum amount of customers you expect?");
		} while (!(Integer.parseInt(tInput.nextLine())>=minCustomers));
		*/

		
		
	}
	
	
/*	private static int addCustomer()
	{
		
		
		
		return 0;
	} */
	
	private static void addBooks()
	{
		for (int i = 0; i < books.length; i++ )
		{
			books[i] = new Book();
			System.out.println("Enter a book name");
			books[i].setTitle(tInput.nextLine());
			System.out.println("Who is the Author?");
			books[i].setAuthor(tInput.nextLine());
			System.out.println("What is the call number?");
			books[i].setCallNumber(cInput.nextLine());

			
			
		}

	}	
	public static void chooseBook(){
	
		int yes = 1;
		while (yes == 1){
		System.out.println("Would you like to check out? 1 for yes, 2 for no");
		yes = wantto.nextInt();
		if (yes == 1){	
				System.out.println("Which would you like to check out?1-7");
				int whichBook = check.nextInt();
				if (books[whichBook].getCheckedOut() == false){
				System.out.println("Checked Out!");
				books[whichBook].setCheckedOut(true);
				
					}
			else{
				System.out.println("Sorry, it is checked out");
			}
				}
		}
			System.out.println("Thank you for your time.");
			

	
	}
}
