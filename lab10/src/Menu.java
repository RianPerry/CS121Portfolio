import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    private Scanner scnr = new Scanner(System.in);
    private Pokedex pokedex = new Pokedex();

    public void displayMenu() {
        while (true) {
            System.out.println("******** MENU ********\nPlease make a selection:\n" +
                    "1) Add a Pokemon\n2) Remove a Pokemon\n3) Display Pokemon Info\n" +
                    "4) Display all Pokemon Info\n5) Exit");
            String select = scnr.nextLine();
            if (select.equals("1")) {
                createPokemon();
            }
            else if (select.equals("2")) {
                removePokemon();
            }
            else if (select.equals("3")) {
                displayPokemon();
            }
            else if (select.equals("4")) {
                displayAllPokemon();
            }
            else {
                break;
            }
        }
    }

    private void createPokemon() {
        System.out.println("Enter Pokemon name:");
        String name = scnr.nextLine();
        System.out.println("Enter Pokemon HP:");
        int hp = Integer.parseInt(scnr.nextLine());
        Pokemon pokemon = new Pokemon(name,hp);
        pokedex.addPokemon(pokemon);

        while (true) {
            System.out.println("Enter move name (or q if finished):");
            String mName = scnr.nextLine();
            if (mName.equals("q")) {
                break;
            }
            System.out.println("Enter move power:");
            int mPower = Integer.parseInt(scnr.nextLine());
            System.out.println("Enter move speed:");
            int mSpeed = Integer.parseInt(scnr.nextLine());
            Move move = new Move(mName,mPower,mSpeed);
            pokemon.addMove(move);
        }
        System.out.println("Pokemon has been added to the Pokedex.");
    }

    private void removePokemon() {
        System.out.println("Enter name of pokemon to remove:");
        String remove = scnr.nextLine();
        if (pokedex.getPokemon(remove) == null) {
            System.out.println("Pokemon not found.");
        }
        else {
            pokedex.removePokemon(pokedex.getPokemon(remove));
        }
    }

    private void displayPokemon() {
        System.out.println("Enter name of pokemon to display:");
        String display = scnr.nextLine();
        if (pokedex.getPokemon(display) == null) {
            System.out.println("Pokemon not found.");
        }
        else {
            System.out.println(pokedex.getPokemon(display));
        }
    }

    private void displayAllPokemon() {
        ArrayList<Pokemon> pokemonArrayList = pokedex.getPokemonArrayList();
        for (Pokemon pokemon : pokemonArrayList) {
            System.out.println(pokemon);
        }
    }
}
