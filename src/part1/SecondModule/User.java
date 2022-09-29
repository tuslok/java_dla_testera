package part1.SecondModule;

import Part5.Gender;
import exceptions.IllegalEmailFormatException;

import java.util.Objects;

public class User implements Comparable<User> {

    // 1. Pole obiektu
    // Opisują z czego bedzie składać się dany obiekt

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;
    private Gender gender;

    // 1a. Pola klasy.
    private static int userCounter = 0;


    // 3. Konstruktor
    // Domyślny konstruktor - tworzy pusty obiekt

    //Nazwa konstruktora jest taka sama jak nazwa klasy
    //Kontruktor piszemy wielką literą
    //Konstruktor nie ma zwracanego typu

    public User(String firstName, String lastName, String email, int age, Gender gender){
        this.firstName = firstName; // pola obiektu = this. wartosci podane z parametrów
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.isAdult = isUserAdult();
        /* albo
        if(age >= 18){
            this.isAdult = true;
        } else {
            this.isAdult = false;
        }*/

        userCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalEmailFormatException {
        if(!email.contains("@")){
            throw new IllegalArgumentException("Incorrect email format - mój wyjątek");
        } else {
            this.email = email;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // 2. Metody
    // Opisują co dany obiekt będzie mógł zrobić

    public void getFullName(){
        // ciało metody
        System.out.println(firstName + " " + lastName);
    }

    public void getAllInfo(){
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge(){
        return age;
    }

    public static int getUserCounter() {
        return userCounter;
    }

    public static void setUserCounter(int userCounter) {
        User.userCounter = userCounter;
    }

    public boolean isUserAdult(){
        if(age >= 18){
            return true;
        } else{
            return false;
        }
    }

    public void greetings(String name){
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    public void greetings(String name, String lastName){
        System.out.println("Hi " + name + " " + lastName + ". Nice to see you!");
    }

    public void howOldAreYou(String name, int age){
        System.out.println("Hi, my name is " + name + ", I'm " + age);
    }

    public int yourAgePlus10(int age){
        return age + 10;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && isAdult == user.isAdult && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email) && gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, isAdult, gender);
    }

    @Override
    public int compareTo(User o) {
        int compareResult = this.getFirstName().compareTo(o.getFirstName());
        if (compareResult == 0){
            compareResult = this.getLastName().compareTo(o.getLastName());
        }
        return compareResult;
    }
}
