package core.basesyntax;

public class RandomFigures {
    public static final int FIGURE_MAX_COUNT = 10;

    public static void main(String[] args) {
        int figuresCount = (int) Math.floor(Math.random() * FIGURE_MAX_COUNT) + 1;
        Figure[] figuresArray = new Figure[figuresCount];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresCount; i++) {
            figuresArray[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < figuresCount; i++) {
            figuresArray[i].drawFigure();
        }
    }
}
