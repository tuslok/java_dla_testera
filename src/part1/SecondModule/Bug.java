package part1.SecondModule;

import exceptions.IllegalBugPriorityException;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {

    private String description;
    private BugReporter bugReporter;
    private int bugPriority;
    private boolean status;

    public Bug(String description, BugReporter bugReporter, int bugPriority) {
        this.description = description;
        this.bugReporter = bugReporter;
        this.bugPriority = bugPriority;
        this.status = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description.length() > 10 ){
            this.description = description;
        } else {
            System.out.println("Description is too short.");
        }
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        if(bugPriority >= 1 && bugPriority <= 5){
            this.bugPriority = bugPriority;
        } else {
            throw new IllegalBugPriorityException("Incorrect bug priority. Check it again.");
        }

        /* lub
        switch (bugPriority){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
            default:{
                System.out.println("Wrong priority.");
                }
        }*/
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        notifyStatusChange();
        this.status = status;
    }


    public void showStatus(){
        System.out.println("Status: " + status);
    }

    @Override
    public String toString() {
        return "Bug{" +
                "description='" + description + '\'' +
                ", bugReporter=" + bugReporter +
                ", bugPriority=" + bugPriority +
                ", status=" + status +
                '}';
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("Status has been changed. ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return bugPriority == bug.bugPriority && status == bug.status && Objects.equals(description, bug.description) && Objects.equals(bugReporter, bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, bugReporter, bugPriority, status);
    }


    @Override
    public int compareTo(Bug bug) {
        return this.getDescription().compareTo(bug.getDescription());
    }
}
