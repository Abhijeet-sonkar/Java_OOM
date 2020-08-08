/*
 author : Abhijeet Sonkar
 Program on how to take user input

*/

package Java_OOM.Basic_Syntax;

import java.util.Scanner;

public class OOM_User_Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the game you want to buy : ");

        String enteredGame = input.nextLine();

        System.out.println("Entered game :" + enteredGame);
    }

}

/*
 * [OUTPUT]
 * 
 * Enter the game you want to buy : COD : Modern Warfare 
 * Entered game :COD : Modern Warfare
 * 
 * 
 * 
 */