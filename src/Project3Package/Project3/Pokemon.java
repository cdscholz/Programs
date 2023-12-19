package Project3Package.Project3;

import java.util.ArrayList;

public class Pokemon {


    //*************************************** INSTANCE VARIABLES (ALL PRIVATE) ***************************************

    //name
    private String name;
    //hitPoints
    private int hitPoints;
    //speed
    private int speed;
    //ArrayList "movesList" that holds a list of the Pokémon's moves
    ArrayList<Move> movesList = new ArrayList<>();


    //*************************************** CONSTRUCTOR ***************************************

    //3 Parameters: name, hitPoints, speed
    public Pokemon (String name, int hitPoints, int speed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.speed = speed;
    }

    //*************************************** METHODS (DETERMINE IF YOU NEED PARAMETERS OR NOT) ***************************************

    //addMove()
    //      --> adds a "move" to movesList
    public void addMove(Move move){
        movesList.add(move);
    }

    //setHitPoints()
    //      --> updates hitPoints with new value (during battle)
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    //getName()
    public String getMove(){
        return name;
    }


    //getHitPoints()
    public int getHitPoints(){
        return hitPoints;
    }

    //getSpeed()
    public int getSpeed(){
        return speed;
    }

    //setSpeed()
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    //getMovesList()
    //      --> returns movesList (if you need to access the whole list in another class)
    public ArrayList<Move> getMovesList(){
        return movesList;
    }

    //getPokemonInfo()
    //      --> returns name, hitPoints, speed
    public int getPokemonInfo(String name, int hitPoints, int speed){
        return name;
        return hitPoints;
        return speed;

    }

    //getMoveByName(String moveName)
    //      --> returns a Move if there is one in the movesList with a name that equals the moveName value
    public void getMoveByName(String Move, String moveName){
        if (moveName == Move) {
            return movesList.get(moveName);
        } else
        {
            System.out.println("There is no move with that name.");
        }
    }













}
