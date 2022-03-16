
import java.util.Scanner;

public class PasswordValidator {

	public static boolean checkPass(String pass) {
		boolean checkUpperLetter = false;
		boolean checkLowerLetter = false;
		boolean checkSpecialChar = false; 
		
		for (int i = 0; i < pass.length(); i++ ) {
			
			char chr = pass.charAt(i);
			if(Character.isUpperCase(chr)) {
				checkUpperLetter = true;
				
			}else if (Character.isLowerCase(chr)) {
				checkLowerLetter = true;
				
			}else if (pass.contains("!")) {
				checkSpecialChar = true;
				
			}
			
			if(checkUpperLetter && checkLowerLetter && pass.contains("!")) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("The password must contain:\r\n"
				+ " At least one lowercase letter\r\n"
				+ " At least one uppercase letter\r\n"
				+ " At least minimum 7 characters\r\n"
				+ " At least maximum 12 characters\r\n"
				+ " An exclamation point: !");
		
		
										
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		
		if(password.length() <= 12 && password.length() >= 7 && checkPass(password) == true) {
			System.out.println("Password valid and accepted");
		}else {
			System.out.println("Error");
		}
		
		
	  }


	}


