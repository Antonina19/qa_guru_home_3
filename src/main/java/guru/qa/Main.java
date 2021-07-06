package guru.qa;

public class Main {
    public static void main(String[] args) {
        Birds trochilidae = new Birds("Trochilinae",true,'s',5);
        Birds spheniscidae = new Birds();
        spheniscidae.genius = "Sphenisciformes";

        Birds.sayNameOfAllBirds();
        System.out.println(trochilidae.genius);
        System.out.println(spheniscidae.genius);






    }
}
