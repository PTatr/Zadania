public class Zadanie {
    public static void main(String[] args) {
        float ziemiaWagaTatarkiewicz = 102;
        float marsGrawitacjaTatarkiewicz = 0.38f;
        System.out.println("Waga oryginalna = " + ziemiaWagaTatarkiewicz + " Grawitacja na marsie = " + marsGrawitacjaTatarkiewicz);
        float marsWagaTatarkiewicz = ziemiaWagaTatarkiewicz * marsGrawitacjaTatarkiewicz;
        double marsWagaTatarkiewicz2 = marsWagaTatarkiewicz;
        System.out.println("Waga na marsie (double) = " + marsWagaTatarkiewicz2);
        System.out.println("Waga na marsie (double zaokraglone) = ");
        System.out.format("%.4f%n", marsWagaTatarkiewicz2);
        int marsWagaTatarkiewicz3 = (int)marsWagaTatarkiewicz2;
        System.out.println("Waga na marsie (int) = " + marsWagaTatarkiewicz3);
        char marsWagaTatarkiewicz4 = (char)marsWagaTatarkiewicz3;
        System.out.println("Waga na marsie (char) = " + marsWagaTatarkiewicz4);
        int nowaZmiennaTatarkiewicz = marsWagaTatarkiewicz4 + 8;
        System.out.println("Wynik dzialania z char = " + nowaZmiennaTatarkiewicz);


    }
}
