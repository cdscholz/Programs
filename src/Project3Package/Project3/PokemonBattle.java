package Project3Package.Project3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PokemonBattle {

    //*************************************** INSTANCE VARIABLES (ALL PRIVATE) ***************************************

    //Instance of the Scanner class
    Scanner keyboard = new Scanner(System.in);
    //Instance of the Random class
    Random random = new Random();
    //Instance of the Pokédex class
    ArrayList<String> Pokedex = new ArrayList<String>();

    //*************************************** DEFAULT CONSTRUCTOR ***************************************

    public PokemonBattle(){

    }

    //*************************************** METHODS ***************************************

    //addPokemonToGame()
    //      --> allows player to add "any number" Pokémon to the game
    //              --> player prompted to enter Pokémon name, hitPoints, speed to create instance of Pokémon
    //              --> player prompted to enter "any number" of moves with name and power, each added to Pokédex's pokeList
    public void addPokemonToGame(){

    }

    //displayPokeList()
    //      --> use Pokedex instance to getPokeList
    //      --> for each Pokémon in the list
    //              --> print each Pokémon's info
    //                      --> number each Pokémon for user to select by number
    //              --> get each Pokémon's movelist and print moveName and movePower
    public void displayPokeList(){

    }

    //selectPlayerPokemon()
    //      --> Pokedex's pokeList is displayed
    //      --> player selects a Pokémon by number
    //              --> calls Pokedex's selectPokemon() method
    //      --? returns playerPokemon
    public void selectPlayerPokemon(){

    }

    //selectcomputerPokemon()
    //      --> calls Pokedex's getRandomPokemon()
    //      --> returns computerPokemon
    public void selectComputerPokemon(){

    }

    //battlePokemon()
    //      --> takes 2 parameters: playerPokemon and computerPokemon
    //      --> determines and displays winner of battle between player and computer Pokémon
    //              --> similar code to Project 1's PokeBattle class
    //              --> you can modify to work how you want
    //              --> does NOT have to be 3 rounds
    //              --> as long as there is a battle and a winner
    public void battlePokemon(){

    }










}
