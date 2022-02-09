package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int upper_bound = 3;
        Random random = new Random();
        int n = 100000;

        int winCount = 0;

        for(int i=0; i<n; i++) {


            int result = random.nextInt(upper_bound);
            int playerChoice = random.nextInt(upper_bound);

            HashSet<Integer> choices = new HashSet<>(Arrays.asList(0,1,2));

            HashSet<Integer> remaining = new HashSet<>(choices);
            remaining.removeAll(new HashSet<>(Arrays.asList(result, playerChoice)));

            int hostReveal = pickRandom(remaining);

            choices.removeAll(new HashSet<>(Arrays.asList(playerChoice, hostReveal)));
            int playerFinalChoice = choices.iterator().next();

            String verdict = null;
            if(result == playerFinalChoice) {
                verdict = "Win";
                winCount++;
            } else {
                verdict = "Lose";
            }

            System.out.println("Result: "+result+" Player Choice: "+playerChoice +" Host Reveal: " + hostReveal+" Player Final Choice: "+ playerFinalChoice+ " Verdict: "+ verdict);
        }

        System.out.println("Wins: "+ winCount+ " Win Ratio: "+ winCount*1.0/n);
    }

    private static int pickRandom(HashSet<Integer> set) {
        int index = new Random().nextInt(set.size());
        Iterator<Integer> iter = set.iterator();
        for (int i = 0; i < index; i++) {
            iter.next();
        }
        return iter.next();
    }
}
