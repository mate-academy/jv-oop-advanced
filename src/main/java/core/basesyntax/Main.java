package core.basesyntax;

public class Main {
    private static final int NUM_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUM_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < NUM_FIGURES; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println("Figure: " + figures[i].getClass().getSimpleName()
                    + ", area: " + figures[i].getArea()
                    + " sq.units, color: " + figures[i].getColor());
        }
    }
}
