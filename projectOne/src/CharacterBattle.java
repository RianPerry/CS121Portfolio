import java.util.Scanner;
import java.util.Random;
public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        int rounds;
        String p1n;
        int p1hp;
        int p1sp;
        String p1sm;
        int p1pow;
        String p2n;
        int p2hp;
        int p2sp;
        String p2sm;
        int p2pow;
        int p1tot = 0;
        int p2tot = 0;
        //select rounds (odd number)
        System.out.print("Select an odd number of rounds to play: ");
        rounds = Integer.parseInt(scnr.nextLine());
        //loop for number of rounds
        for (int i = 0; i < rounds; ++i) {
            //select character & enter info
            //player 1
            System.out.println("Player 1:");
            System.out.println("What is your character's name?");
            p1n = scnr.nextLine();
            System.out.println("How many hit points does " + p1n + " have? (?/20)");
            p1hp = Integer.parseInt(scnr.nextLine());
            System.out.println("What is " + p1n + "'s speed? (?/20)");
            p1sp = Integer.parseInt(scnr.nextLine());
            System.out.println("What is " + p1n + "'s signature move?");
            p1sm = scnr.nextLine();
            System.out.println("What is its power? (?/20)");
            p1pow = Integer.parseInt(scnr.nextLine());
            //player 2
            System.out.println("Player 2:");
            System.out.println("What is your character's name?");
            p2n = scnr.nextLine();
            System.out.println("How many hit points does " + p2n + " have? (?/20)");
            p2hp = Integer.parseInt(scnr.nextLine());
            System.out.println("What is " + p2n + "'s speed? (?/20)");
            p2sp = Integer.parseInt(scnr.nextLine());
            System.out.println("What is " + p2n + "'s signature move?");
            p2sm = scnr.nextLine();
            System.out.println("What is its power? (?/20)");
            p2pow = Integer.parseInt(scnr.nextLine());
            //determine the winner via the turns
            if (p1sp > p2sp) {
                //p1 turn
                while (p1hp > 0 && p2hp > 0) {
                    p2hp = p2hp - p1pow;
                    if (p2hp <= 0) {
                        System.out.println("Player 1 (" + p1n + ") wins!");
                        p1tot = p1tot + 1;
                        break;
                    }
                    p1hp = p1hp - p2pow;
                    if (p1hp <= 0) {
                        System.out.println("Player 2 (" + p2n + ") wins!");
                        p2tot = p2tot + 1;
                        break;
                    }
                }
            }
            else if (p1sp < p2sp) {
                //p2 turn
                while (p1hp > 0 && p2hp > 0) {
                    p1hp = p1hp - p2pow;
                    if (p1hp <= 0) {
                        System.out.println("Player 2 (" + p2n + ") wins!");
                        p2tot = p2tot + 1;
                        break;
                    }
                    p2hp = p2hp - p1pow;
                    if (p2hp <= 0) {
                        System.out.println("Player 1 (" + p1n + ") wins!");
                        p1tot = p1tot + 1;
                        break;
                    }
                }
            }
            else {
                //random turn
                int turn = rand.nextInt(2);
                if (turn == 0) {
                    //p1 turn
                    while (p1hp > 0 && p2hp > 0) {
                        p2hp = p2hp - p1pow;
                        if (p2hp <= 0) {
                            System.out.println("Player 1 (" + p1n + ") wins!");
                            p1tot = p1tot + 1;
                            break;
                        }
                        p1hp = p1hp - p2pow;
                        if (p1hp <= 0) {
                            System.out.println("Player 2 (" + p2n + ") wins!");
                            p2tot = p2tot + 1;
                            break;
                        }
                    }
                }
                else {
                    //p2 turn
                    while (p1hp > 0 && p2hp > 0) {
                        p1hp = p1hp - p2pow;
                        if (p1hp <= 0) {
                            System.out.println("Player 2 (" + p2n + ") wins!");
                            p2tot = p2tot + 1;
                            break;
                        }
                        p2hp = p2hp - p1pow;
                        if (p2hp <= 0) {
                            System.out.println("Player 1 (" + p1n + ") wins!");
                            p1tot = p1tot + 1;
                            break;
                        }
                    }
                }
            }
        }
        //print final scores (how many rounds each player won)
        System.out.println("Player 1's final score is: " + p1tot);
        System.out.println("Player 2's final score is: " + p2tot);
        //print the overall winner
        if (p1tot > p2tot) {
            System.out.println("Player 1 wins overall!");
        }
        else if (p1tot < p2tot) {
            System.out.println("Player 2 wins overall!");
        }
        else {
            System.out.println("did you make sure to pick an odd number of rounds?");
        }
    }
}
