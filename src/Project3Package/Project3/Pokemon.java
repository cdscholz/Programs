package Project3Package.Project3;

public class Pokemon {


    //*************************************** INSTANCE VARIABLES (ALL PRIVATE) ***************************************

    //name
    private String name;
    //hitPoints
    private int hitPoints;
    //speed
    private int speed;
    //ArrayList "movesList" that holds a list of the Pokémon's moves


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
    public void addMove(){

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
    public void setSpeed(int speed){
        this.speed = speed;
    }

    //getMovesList()
    //      --> returns movesList (if you need to access the whole list in another class)
    public void getMovesList(){

    }

    //getPokemonInfo()
    //      --> returns name, hitPoints, speed
    public int getPokemonInfo(){
        return String name;
        return hitPoints;
        return speed;

    }

    //getMoveByName(String moveName)
    //      --> returns a Move if there is one in the movesList with a name that equals the moveName value
    public void getMoveByName(String moveName){

    }













}
