package part2.model.computer;

public interface Music {

    // Metody - zachowanie

    // 1. Nie można dodawać pól obiektów
    // 2. Można tworzyć tylko stałe (domyślnie public static final)

    String NAME = "Music";

    // 3. Możemy tworzyć tylko metody abstrakcyjne (domyślnie public abstract)

    void playMusic();
    void pauseMusic();
    void stopMusic();

    // Od Javy 8

    // 4. Metody domyślne - zwykłe metody
    default void sayHello(){
        System.out.println("Hello from default Music");
    }

    // 5. Metody statyczne
    static String getName(){
        return NAME;
    }

    // 6. Prywatne statyczne metody

    private static void privateMethod(){
        System.out.println("Hello from private method");
    }

}
