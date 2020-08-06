
/*
 author: Abhijeet Sonkar
 Programme to illustrate instantiation of class
*/

package Java_OOM.Classes_And_Objects;

public class OOM_Instantiating_Class {
    public static void main(String[] args) {

        Game newGame = new Game();

        newGame.name = "Call of Duty: Modern Warfare";
        newGame.genre = "First-person shooter";

        newGame.printGameDetails();
    }
}

class Game {

    //Instance Variables
    String name;
    String genre;

    //Subroutine(method)
    void printGameDetails() {
        System.out.println("Name of the game  : " + this.name);
        System.out.println("Genre of the game : " + this.genre);
    }
}

/*
   [OUTPUT]
 Name of the game  : Call of Duty: Modern Warfare
 Genre of the game : First-person shooter

*/