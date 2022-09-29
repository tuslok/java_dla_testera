package part1.SecondModule;

import Part5.Gender;

public class MainApp {

    public static void main(String[] args) {

        User michal = new User("Michał", "Nazwisko", "michal@test.com", 16, Gender.MALE); // wywołanie konstruktora

        //michal.getAllInfo();

        User tomasz = new User("Tomasz", "Ważny", "tomasz@email.cz", 29, Gender.MALE);
        User tomasz1 = new User("Tomasz", "Ważny", "tomasz@email.cz", 29, Gender.MALE);

        //System.out.println(tomasz);

        //System.out.println(tomasz.equals(tomasz1));

        BugReporter bugReporter = new BugReporter("Michał", "Nowak", "nowak@test.com");
        Bug firstBug = new Bug("Record does not exist",bugReporter, 3);

        System.out.println(bugReporter);
        System.out.println(firstBug);

        //firstBug.showStatus();
        //int priorityFirstBug = firstBug.getBugPriority();
        //System.out.println("Priority: " + priorityFirstBug);

        firstBug.setStatus(true);
        System.out.println(firstBug);

        tomasz.setEmail("anymail.ru");

        firstBug.setDescription("Edited bug description");
        System.out.println("Get description: " + firstBug.getDescription());
        firstBug.setBugPriority(2);
        /*firstBug.setEmail("anybody@gmail.com");
        System.out.println("Get e-mail: " + firstBug.getEmail());
        firstBug.setBugPriority(-5);
        System.out.println("Get priority: " + firstBug.getBugPriority());

        firstBug.showInfoAboutBug();*/

        /*System.out.println(User.getUserCounter());


        String michalTest = StringUtils.getFormattedString("MichalTestText");
        System.out.println(michalTest);

        String michalTest1  = StringUtils.getFormattedString("michal");
        System.out.println(michalTest1);

        System.out.println(WeekUtils.MONDAY);*/

    }
}
