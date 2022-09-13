package activity;
import java.util.Scanner;
class Activity1 { 
    public static void main(String[] args) {

    	 Scanner input = new Scanner(System.in);
         String str = input.nextLine(), reverseStr = "";
         input.close();
         int strLength = str.length();

         // reversing string
    }
    public static void function(String s)
    {
        String line = "";
        for (int i = (s.length() - 1); i >= 0; --i) {
            line += s.charAt(i);
        }
        if(s.toLowerCase().equals(line.toLowerCase()))
        {
            System.out.println(s + " is a Palindrome");
        }
        else{
            System.out.println(s + " is not a Palindrome");
        }
    }
}