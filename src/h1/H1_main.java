package h1;

public class H1_main {
    public static void main(String[] args) {

        Zahl zahl1 = new Zahl();

        zahl1.num = 98;

        zahl1.setEven();
        zahl1.setPositive();
        zahl1.setSmall();

        System.out.println("Die Zahl " + zahl1.num);
        System.out.println(" ist gerade? " + zahl1.even);
        System.out.println(" ist positiv? " + zahl1.positive);
        System.out.println(" ist klein? " + zahl1.small);

    }
}
