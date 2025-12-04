package h1;

public class Zahl {
    // öffentliche & nicht statische Attribute (Eigenschaften):
    public boolean even = true;
    public boolean small = true;
    public boolean positive = true;
    public int num = 100;

    // Methoden (Fähigkeiten):
    public void setEven() {
        even = num % 2 == 0;
    }

    public void setPositive() {
        positive = num > 0;
    }

    public void setSmall() {
        small = num < 100;
    }
}
