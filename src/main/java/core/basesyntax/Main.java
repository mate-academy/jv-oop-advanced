package core.basesyntax;

public class Main {
    public static final int FIGURE_COUNT = 5;

    public static void main(String[] args) {
        Figures[] figuresList = getShapes();
        for (Figures list : figuresList) {
            list.draw();
        }
    }

    private static Figures[] getShapes() {
        Figures[] figures = new Figures[FIGURE_COUNT];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < FIGURE_COUNT; i++) {
            figures[i] = supplier.getRandomFigure();
        }
        return figures;
    }
}
