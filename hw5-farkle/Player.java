import java.util.ArrayList;

public class Player {
    private int score;
    private int turnScore;
    private ArrayList<Die> dice;
    private String name;


    public Player(String name){
        this.name = name;
        dice = new ArrayList<Die>();

        createDice();
    }


    private void createDice(){
        for(int i = 0; i < 6; i++){
            dice.add(new Die());
        }
    }


    public void roll(){
        for(Die d : dice){
            d.roll();
        }
    }

    public void setAsideDice(){
        
    }

    public String getName(){
        return name;
    }


    public ArrayList<Die> getDice(){
        return dice;
    }


    public int getTurnScore(){
        return turnScore;
    }


    public int getTotalScore(){
        return score;
    }

}
