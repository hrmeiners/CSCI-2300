import java.util.Random;


public class Die {
    private static Random RNG;
    private int value;

    public Die(){
        RNG = new Random();

        value = roll();
    }

    public int roll(){
        return RNG.nextInt(6) + 1;
    }

    public int getValue(){
        return value;
    }
}
