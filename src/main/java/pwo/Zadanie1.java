package pwo;

public class Zadanie1 {

    public static final int FROM = 0, TO = 100;
    public static final String FILE_NAME = "fibseq100.txt";
    public static final String FIBONACCI_FILE_NAME = "figseg100.txt";

    public static void main(String[] args) {

        System.out.println("Fibonacci wersja 2");

        boolean ok = SequenceTools.writeToFile(
                new FibonacciGenerator(), FROM, TO, FIBONACCI_FILE_NAME);

        if (ok) {
            System.out.println("Wynik zapisany do pliku: "
                    + FILE_NAME);
        } else {
            System.out.println("Błąd");
        }
    }
}