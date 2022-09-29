package part3;


import part1.SecondModule.Bug;
import part1.SecondModule.BugReporter;

import java.util.*;

public class MainTask {

    public static void main(String[] args) {


        List<Bug> bugs = new ArrayList<>();
        bugs.add(new Bug("System not working", new BugReporter("Marek", "Kotarski", "kot@yt.com"), 1));
        bugs.add(new Bug("Missing letter 't' in alphabet", new BugReporter("Mark", "Spancer", "spancer@test.com"), 2));
        bugs.add(new Bug("Incorrect value in table xyt_s", new BugReporter("Kate", "Polanski", "pol@kot.eu"), 4));
        bugs.add(new Bug("Missing web element in landing page", new BugReporter("Olivier", "No_name", "nn@buggers.com"), 2));
        bugs.add(new Bug("Incorrect description in popup", new BugReporter("Stefan", "Dab", "support@dab.com"), 4));
        bugs.add(new Bug("Incorrect value in table xyt_s", new BugReporter("Kate", "Polanski", "pol@kot.eu"), 4));

        System.out.println("List");
        System.out.println(bugs.size());
        for (Bug bug : bugs) {
            System.out.println(bug);
        }


        Set<Bug> sets = new HashSet<>(bugs);
        System.out.println("Hashset");
        System.out.println(sets.size());
        for(Bug set : sets){
            System.out.println(set);
        }

        Set<Bug> sortedBugs = new TreeSet<>(sets);
        System.out.println("Hashtree");
        System.out.println(sets.size());
        for(Bug bug : sortedBugs){
            System.out.println(bug);
        }

    }

}
