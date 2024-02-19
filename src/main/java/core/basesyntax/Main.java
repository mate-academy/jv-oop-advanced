package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 6;
    private static FigureSupplier figure = new FigureSupplier();

    public static void main(String[] args) {
        Figure [] figuresArray = new Figure[FIGURE_COUNT];
        for (int i = 0; i < FIGURE_COUNT; i++) {
            figuresArray[i] = (i < FIGURE_COUNT / 2)
                    ? figure.getRandomFigure() : figure.getDeafultFigure();
            figuresArray[i].draw();
        }
    }
}
