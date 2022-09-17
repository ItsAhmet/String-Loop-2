import java.util.*; 
public class PracticeSpace {


	public static void main(String[] args) 
	
	{
		
		
		
		//Letters method
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a word -->");
		String i1 = scan.nextLine();
		
		
		System.out.println("Enter a letter");
		String i2 = scan.nextLine();
		
		
		int x = 0;
		for(int y=0; y<i1.length();y++) {
			if(i1.charAt(y) == i2.charAt(0)) {
				x++;
			}
		}

				 
		System.out.println("The letter " + i2 + " is in the word " + i1 +" "+ x + " times");

		
		
		
		//word method
		
		
		
		System.out.println("Enter a word");
		String i3 = scan.nextLine();
		
		
		System.out.println(i3);
		
		
		for(int i = (i3.length()-1); i>=1; i--){
			
			
			System.out.println(i3.substring(0,i));
			
			}
		
		
		
		//bingo method
		
		
		System.out.println("Input a word -->");
		String i4 = scan.nextLine();
		
		
		for(int i = 0;  i<i4.length(); i++){
			System.out.println(i4);
			i4 = i4.replace(i4.charAt(i),'_');

		}
}
}
