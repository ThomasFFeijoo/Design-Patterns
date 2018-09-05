package strategy_pattern;

public class Animal {

    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

// Instead of using an interface in a traditional way use an instance variable that is a subclass of the Flys interface.

// Animal doesn't care what flyingType does, it just knows the behavior is available to its subclasses

// This is known as Composition : Instead of inheriting an ability through inheritance the class is composed with
// Objects with the right ability

// Composition allows you to change the capabilities of objects at run time!

    public Flys flyingType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be bigger than 0");
        }
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    /* BAD
	    * You don't want to add methods to the super class.
	    * You need to separate what is different between subclasses
	    * and the super class

	    public void fly(){
	        System.out.println("I'm flying");
	    }

	*/

    // Animal pushes off the responsibility for flying to flyingType

    public String tryToFly(){
        return flyingType.fly();
    }

    // If you want to be able to change the flyingType dynamically add the following method

    public void setFlyingAbility(Flys newFlyType){
        flyingType = newFlyType;
    }
}
