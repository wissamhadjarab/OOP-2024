package ie.tudublin;

public class Cat extends Animal {

    private int numLives;

    public void speak()
    {
        System.out.println("Meaow: " + getName());
    }

    public Cat(String name)
    {
        setName(name);
    }


    public Cat(int numLives) {
        setNumlives(numLives);
        setNumlives(9);
    }
   

    //Public accessor for the private int field numLives
    public int getNumLives() {
        return numLives;
    }

    //method (function) to decrease numLives called kill
    public void kill() {
        if (numLives > 0) {
            numLives--;
            System.out.println("Ouch!");
        } else {
            System.out.println("Dead");
        }
    }

    public void setNumlives(int numLives) {
        this.numLives = numLives;
    }
	
}


