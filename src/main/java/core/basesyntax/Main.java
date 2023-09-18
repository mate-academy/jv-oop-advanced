package core.basesyntax;

public class Main {
    private static final int NUM_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUM_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < NUM_FIGURES; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            System.out.println("Figure: " + figure.getClass().getSimpleName()
                    + ", area: " + figure.getArea() + " sq.units, color: " + figure.getColor());
        }
    }
}
