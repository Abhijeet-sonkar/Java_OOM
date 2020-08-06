
/*
  author : Abhijeet Sonkar
  Programme to illustrate the use of getter and setter in class
*/

package Java_OOM.Classes_And_Objects;

public class OOM_Setter_Getter {
    public static void main(String[] args) {
        ModifiedGame newGame = new ModifiedGame();
        newGame.setName("Assassin's Creed Valhalla");
        newGame.setGenre("Action role-playing game");

        System.out.println("Name of the game  : " + newGame.getName());
        System.out.println("Genre of the game : " + newGame.getGenre());
     }

}

class ModifiedGame {
    String name;
    String genre;

    void setName(String name) {
        this.name = name;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

    String getName() {
        return this.name;

    }

    String getGenre() {
        return genre;
    }
}

/* [OUTPUT]

  Name of the game  : Assassin's Creed Valhalla
  Genre of the game : Action role-playing game

*/