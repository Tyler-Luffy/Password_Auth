
package Loop_Week_5;

import java.util.Scanner;

public class Password_Loops {

    public static void main(String[] args) {
        
        //establish Variables
        final String Password = "PoirierWinz";
        String Userinput;
        final int MaxAttempts = 3;
        int Attempts = 0;
        
        //loop password attempts
        while (Attempts <= MaxAttempts) {
        System.out.println("Input Password");
        Scanner Userscanner = new Scanner(System.in);
        Userinput = Userscanner.next(); //Stores and scans user
        
        if (Userinput.equals(Password)){
        System.out.println("Poirier is pretty dope isn't he!");
        System.out.println("Okay here is the meaning of life");
        System.out.println("42");
        break;
        } else{
            System.out.println("Not quite buddy, Imma give you a small hint.");
            System.out.println("A fighter who beat Conor McGregor");
            Attempts = Attempts + 1;
        }
        
        System.out.println("You have exceeded the max number of attempts.");
        }    
    }       
}
