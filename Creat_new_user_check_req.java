
    import java.util.Scanner;

public class Creat_new_user_check_req {
  // Henadzi Kirykovich CS 210
  // 5/16/2025
  // "Practice 14"
  // Description: create a new user ID is mathing requarment

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  
    int minLength, maxLength; 
    String userId;
    System.out.println("Put your min length of ID number"); 
    minLength=input.nextInt();
    System.out.println("Put your max length of ID number"); 
    maxLength=input.nextInt();
    boolean isValid; // my flag for stopping looping
  

    do {
		isValid = true;

      	System.out.println("Put your ID number"); 
      	userId = input.next();
      	
	  
	  if (!checkLength(userId, minLength, maxLength)) {
		System.out.println("The length you line must be from " + minLength + " to " + maxLength);
		isValid = false;
	  }
	   if (!checkLetter(userId)) {
		System.out.println("You first character must be letter [a-z A-Z]");
		isValid = false;
	  }
	  if (!checkFirstLastCharacter(userId)) {
		System.out.println("Your first and last character must be the same");
		isValid = false;
	  }
	  if (!checkTwoNumber(userId)) {
		System.out.println("You must have at least two digits in your ID");
		isValid = false;
	  }

	  if (!twoSpecialNotConsecutive(userId)) {
		System.out.println("Your must have two special char but dont appear consecutively");
		isValid = false;
	  }
  } while (!isValid); // Repeat until the condition is met
}

// My Methods: 

 // checking length my ID must be min to max
 public static boolean checkLength(String userId, int minLength, int maxLength) {

  return (userId.length() >= minLength && userId.length() <= maxLength);

  };

  // method must start with letter // Check if the first character is a letter     
 public static boolean checkLetter(String userId) {     
    return Character.isLetter(userId.charAt(0));
  };

  // method // Check if the userId contains at least two digits
public static boolean checkTwoNumber(String userId) {
    int digitCount = 0;
    for (int i = 0; i < userId.length(); i++) {
        if (Character.isDigit(userId.charAt(i))) {
            digitCount++;
        }
    }
    return digitCount >= 2;
}

// // Check if the first and last characters are the same
 public static boolean checkFirstLastCharacter(String userId) {
    return (userId.charAt(0) == userId.charAt(userId.length() - 1));
 }

 // Check if the userId contains at least two special characters that are not consecutive
 public static boolean twoSpecialNotConsecutive(String userId) {
    int specialCount = 0;

    for (int i = 0; i < userId.length(); i++) {
        char current = userId.charAt(i);

        if (!Character.isLetterOrDigit(current)) { // Check special characters or letter or digit  false -> if special 
			// ho ahead check -> if this cpecial char is reapeat , the same with last char  
            if (i > 0 && userId.charAt(i - 1)== current) { // check previous and compair with current
                return false; // Two special characters in a row (e.g., ##)
            }
            specialCount++;
        }
    }
    return specialCount >= 2; // 'zen' aproach use single line 
	}
}

