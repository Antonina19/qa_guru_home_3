package guru.qa;

public class Main {
    public static void main(String[] args) {
        Birds trochilidae = new Birds("Trochilinae",true,'s',5);
        Birds spheniscidae = new Birds();
        spheniscidae.genius = "Sphenisciformes";

        spheniscidae.setHeight(70);

        Birds.sayNameOfAllBirds();
        System.out.println("Birds genius - " + trochilidae.getGenius());
        System.out.println("Birds height - " + trochilidae.height);
        System.out.println("Birds genius - " + spheniscidae.genius);
        System.out.println("Birds height - " + spheniscidae.height);






    }
}
