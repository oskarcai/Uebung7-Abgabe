package h3;

public class Mensch {
    // Attribute (Eigenschaften):
    public String name = "Oskar";
    public int gebJahr = 2007;
    public int alter = 2025 - 2007;

    // Methoden (Fähigkeiten):
    public void setName(String name) {
        this.name = name;
    }
    public void setGebJahr(int gebJahr) {
        this.gebJahr = gebJahr;
    }
    public void setAlter() {
        this.alter = 2025 - gebJahr;
    }

    public String getName() {
        return name;
    }
    public int getGebJahr() {
        return gebJahr;
    }
    public int getAlter() {
        return alter;
    }
}
