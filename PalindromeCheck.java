package beginnersbook.com;
import java.util.Scanner;

class PalindromeCheck
{

    public static boolean isPalindrome(String user_input)
    {   // if length is 0 or 1 then String is palindrome
        if(user_input.length() == 0 || user_input.length() == 1)
            return true; 
        if(user_input.charAt(0) == user_input.charAt(s.length()-1))

        return isPal(user_input.substring(1, user_input.length()-1));

        return false;
    }

    public static void main(String[]args)
    {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();

        if(isPalindrome(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
}
