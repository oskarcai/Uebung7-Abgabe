package p1;

public class P1_main {
    public static void main(String[] args) {
        // Aufgabenteil a:
        multFrac(5,2,3,4);

        // Aufgabenteil c:
        multFrac(new Bruch(5,2), new Bruch(3,4));
      /*alternativ:
        Bruch a = new Bruch(5,2);
        Bruch b = new Bruch(3,4);
        multFrac(a,b);
       */

        // Aufgabenteil d:
        Bruch d = new Bruch(15,8);
        System.out.println(d);
      //System.out.println(d.toString()); äquivalent
        // -> toString()-Methode überschreiben für sinnvolle Darstellung
    }

    public static void multFrac(int z1, int n1, int z2, int n2) {
        int zaehler = z1 * z2;
        int nenner = n1 * n2;
        System.out.println(zaehler + ":" + nenner);
    }

    public static void multFrac(Bruch a, Bruch bruch) {
        multFrac(a.z, a.n, bruch.z, bruch.n);
    }
}
