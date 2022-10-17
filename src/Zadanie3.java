import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        int liczbaKlockowTatarkiewicz = 77;
        int maxKlockowNaPojemnikTatarkiewicz = 8;
        int pojemnikiTatarkiewicz = liczbaKlockowTatarkiewicz / maxKlockowNaPojemnikTatarkiewicz;
        int klockiResztaTatarkiewicz = liczbaKlockowTatarkiewicz % maxKlockowNaPojemnikTatarkiewicz;
        System.out.println("Liczba pelnych pojemnikow = " + pojemnikiTatarkiewicz);
        System.out.println("Liczba wszystkich uzywanych pojemnikow = " + (pojemnikiTatarkiewicz + 1));
        System.out.println("Liczba klockow w niezapelnionym pojemniku = " + klockiResztaTatarkiewicz);

    }
}
