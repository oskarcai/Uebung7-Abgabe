package h3;

public class H3_main {
    public static void main(String[] agrs) {
        Mensch Elsa = new Mensch(); // neues Objekt Mensch "Elsa" erzeugen

        // Übergabewerte
        Elsa.setName("Elsa");
        Elsa.setGebJahr(2010);
        Elsa.setAlter();

        // Rückgabewerte
        System.out.println("Name: " + Elsa.getName());
        System.out.println("Geburtsjahr: " + Elsa.getGebJahr());
        System.out.println("Alter: " + Elsa.getAlter());
    }
}
