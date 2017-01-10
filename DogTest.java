// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
		Yorkshire york = new Yorkshire("Spot");
		System.out.println(york.getName() + " says " + york.speak() + ", average weight is: " + york.avgBreedWeight());

		Labrador lab = new Labrador("Spike", "Black");
		System.out.println(lab.getName() + " says " + lab.speak() + ", average weight is: " + lab.avgBreedWeight());
    }
}
