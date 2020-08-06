/**
 *
		Author : Shyam Tayal

 		Name of the sum function in every case is exactly same but differ by "number and type of arguments" passed into it.
		This is an example of polymorphism in Object Oriented Methodology
 *
 **/

package Java_OOM.OOM_concepts;

public class Polymorphism {

    // This sum() takes two int parameters
	public int sum(int x, int y)		// 2 int type arguments
    {
        return (x + y);
    }

    // Overloaded sum().
    // This sum() takes three int parameters
    public int sum(int x,int y,int z)		//3 int type arguments
    {
        	return (z - x + y );
    }

    // Overloaded sum().
    // This sum() takes two double parameters
    public double sum(double x, double y)		//double type arguments
    {
        return (x + y);
    }

	public static void main(String[] args) {
		//
		Polymorphism s = new Polymorphism();

        System.out.println(s.sum(100, 220));
        System.out.println(s.sum(100, 220, 333));
        System.out.println(s.sum(101.59, 200.25));
	}

}

/*
	Output:

	320						-- Addition of two integer tyoe numbers
	3						 	-- Difference and Addition among three integer type numbers
	301.84				-- Addition of two double type numbers

*/
