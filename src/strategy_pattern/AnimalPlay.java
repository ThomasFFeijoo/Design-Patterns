package strategy_pattern;

public class AnimalPlay {

    public static void main(String[] args) {
        Animal bella = new Dog();
        Animal tweet = new Bird();

        System.out.println("Dog: " + bella.tryToFly());
        System.out.println("Bird: " + tweet.tryToFly());

        // This allows dynamic changes for flyingType

        bella.setFlyingAbility(new ItFlys());

        System.out.println("Dog: " + bella.tryToFly());
    }
}
