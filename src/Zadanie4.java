import java.math.BigDecimal;

public class Zadanie4 {
    public static void main(String[] args) {
        double nettoTatarkiewicz = 9.99;
        double vatTatarkiewicz = 0.23;
        double bruttoTatarkiewicz = (vatTatarkiewicz + 1) * nettoTatarkiewicz;
        double zarobekTatarkiewicz = 10000 * bruttoTatarkiewicz * (1 - vatTatarkiewicz);
        System.out.println("Zarobek po opodotkowaniu = " + zarobekTatarkiewicz + ", Wartość brutto = " + bruttoTatarkiewicz);

        BigDecimal nettoTatarkiewicz2 = new BigDecimal(9.99);
        BigDecimal vatTatarkiewicz2 = new BigDecimal(0.23);
        BigDecimal bruttoTatarkiewicz2 = (new BigDecimal(1).add(vatTatarkiewicz2)).multiply(nettoTatarkiewicz2);
        BigDecimal zarobekTatarkiewicz2 = new BigDecimal(10000).multiply(bruttoTatarkiewicz2).multiply((new BigDecimal(1).subtract(vatTatarkiewicz2)));
        System.out.println("Zarobek po opodotkowaniu = " + zarobekTatarkiewicz2 + ", Wartość brutto = " + bruttoTatarkiewicz2);
    }
}
