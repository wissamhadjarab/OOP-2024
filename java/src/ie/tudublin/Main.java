
// Packages must match the folder structure
package ie.tudublin;

public class Main
{

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Life());
    }

	public void doDogStuff()
	{
		// Create a new Dog called Misty
		// Call the constructor
		Dog misty = new Dog("Misty");
		misty.speak();

        Dog lucy = new Dog("Lucy");
		lucy.speak();
	}

	public void doCatStuff()
	{
		// Put your code here
		Cat ginger = new Cat("Ginger");

		// Displaying the initial number of lives
        System.out.println(ginger.getName() + "'s initial number of lives: " + ginger.getNumLives());

		while (ginger.getNumLives() > 0) {
            ginger.kill();
        }

        // Displaying a message when the cat is dead
        System.out.println(ginger.getName() + " is now dead.");

		System.out.println("cats are from space");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		
		
		Main m = new Main();

		m.doDogStuff();

		m.doCatStuff();

		Dog nuala = new Dog("Nuala");
		nuala.speak();

		Cat atuma = new Cat("Atuma");
		atuma.speak();

		Animal larry = new Dog("Larry");
		larry.speak();


		larry = new Cat("TopCat");
		larry.speak();

		Animal a = new Dog("A");
		Animal b = new Dog("B");
		Animal c = a;
		a.setName("G");

		System.out.println(a.getName());
		System.out.println("C: " + c.getName());
		
		Cat ginger = new Cat("Ginger");

		// Displaying the initial number of lives
        System.out.println(ginger.getName() + "'s initial number of lives: " + ginger.getNumLives());

		while (ginger.getNumLives() > 0) {
            ginger.kill();
        }

        // Displaying a message when the cat is dead
        System.out.println(ginger.getName() + " is now dead.");

		m.helloProcessing();
	}
	
}