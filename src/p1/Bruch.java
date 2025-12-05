package p1;

public class Bruch {
    // Attribute/Instanzvariablen (Eigenschaften):
    public int z;
    public int n;

    // Konstruktor-Methode:
    public Bruch(int zaehler, int nenner) {
        z = zaehler;
        n = nenner;
    }

    // Methoden (Fähigkeiten):
    public String toString() {
        return z + ":" + n;
    }
}
