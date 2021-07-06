package guru.qa;

public class Birds {
    static String nameByLatin = "avis";

    String genius;
    boolean isFlying;
    char size = 's';
    int height;

    String getGenius(){
        return genius;
    }

    void setHeight (int height){
        this.height = height;
    }

    public Birds() {
    }

    public Birds(String genius, boolean isFlying, char size, int height) {
        this.genius = genius;
        this.isFlying = isFlying;
        this.size = size;
        this.height = height;
    }

    static void sayNameOfAllBirds(){
        System.out.println(nameByLatin);
    }
}
