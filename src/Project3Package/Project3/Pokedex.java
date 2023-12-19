package Project3Package.Project3;

public class Pokedex {

    //*************************************** INSTANCE VARIABLES (PRIVATE) ***************************************

    //ArrayList of Pokémon instances (objects) called "pokeList"

    //Declare and instantiate Random class for random number


    //*************************************** DEFAULT CONSTRUCTOR ***************************************

    public Pokedex(){

    }

    //*************************************** METHODS ***************************************

    //addPokemon()
    //      --> adds instance of Pokemon class to pokeList

    //getPokeList()
    //      --> returns pokeList (if you need to access the whole list in another class)
    public void pokeList(){

    }

    //selectPokemon()
    //      --> takes a number as a parameter
    //      --> returns "instance" of the Pokémon class from list by using number as index
    //              --> in PokemonBattle, user picks number of chosen Pokémon based on displayPokeList() numbering (see output example)
    //              --> if number in getPokeList starts with 1, any index would be "number - 1"
    public void selectPokemon(){

    }

    //getRandomPokemon()
    //      --> for the computer's Pokémon
    //      --> returns a random Pokémon from pokeList that is not the same as the player's Pokémon
    //      --> takes a parameter of the player's selectedPokemon() pokemon
    //      --> gets the index number of the Pokémon using pokeList.indexOf(pokemon)
    //      --> gets a randomNumber based on the size of pokeList
    //              --> if randomNumber is same as index number of player's Pokémon:
    //                      --> if randomNumber is last index number
    //                              --> assign randomNumber the value of 0
    //                      --> else, add 1 to the randomNumber
    //      --> get a randomPokemon from the list using the randomNumber as index
    //      --> return randomPokemon
    public void getRandomPokemon(){

    }

    //getRandomMove()
    //      --> for computer's Pokémon
    //      --> takes computer's Pokémon as parameter
    //      --> gets a randomNumber based on size of computer Pokémon's moveList
    //      --> uses randomNumber to get a randomMove from the list, and then gets its moveName
    //      --> returns moveName (a String)
    public void getRandomMove(){

    }

















}
