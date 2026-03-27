package generics;

public class generics {
    public static void main(String[] args) {
        Printer <Integer> print = new Printer<>(23);
        print.print();
        Printer <Double> doublePrint = new Printer<>(23.00);
        doublePrint.print();

    }
}
