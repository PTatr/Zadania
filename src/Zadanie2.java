import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        Random losowanieTatarkiewicz = new Random();
        int numerTatarkiewicz = losowanieTatarkiewicz.nextInt(1,100);

        if (numerTatarkiewicz % 2 == 0)
            System.out.println("Wylosowany numer: " + numerTatarkiewicz + " jest parzysty.Zostao sprawdzone czy liczba ma reszte z dzielenia przez 2.");
        else
            System.out.println("Wylosowany numer: " + numerTatarkiewicz + " jest nieparzysty. Zostao sprawdzone czy liczba ma reszte z dzielenia przez 2.");

    }
}
