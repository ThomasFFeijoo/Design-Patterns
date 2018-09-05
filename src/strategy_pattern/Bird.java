package strategy_pattern;

public class Bird extends Animal {

    public Bird() {
        super();

        setSound("Tweet");

        // We set the Flys interface polymorphically
        // This sets the behavior as a flying Animal

        flyingType = new ItFlys();
    }
}
