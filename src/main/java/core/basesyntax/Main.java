package core.basesyntax;

public class Main {
    private static final int COUNT_FIGURE = 15;

    public static void main(String[] args) {
        Figure[] figureArray = new Figure[(int)(Math.random() * COUNT_FIGURE) + 1];

        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = new FigureSupplier().figureGenerator();
            figureArray[i].drawFigure();
        }
    }
}
