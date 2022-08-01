package core.basesyntax;

public class Main {
    private static final int SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figures[] figures = new Figures[SIZE];

        for (int i = 0; i < SIZE / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        for (int i = SIZE / 2; i < SIZE; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        for (Figures figure : figures) {
            System.out.println(printInfo(figure));
        }
    }

    private static String printInfo(Figures figure) {
        return "Figure: " + figure + ", area: " + figure.getArea() + " square units.";
    }
}
