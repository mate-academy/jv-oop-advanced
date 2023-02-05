package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        FigureSupply figureSupply = new FigureSupply();
        for (int i = 0; i < FIGURE_COUNT; i++) {
            figures[i] = figureSupply.generateRandomFigure();
            figures[i].draw();
        }
    }
}
