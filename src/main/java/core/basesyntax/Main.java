package core.basesyntax;

public class Main {

    private static final int NUMBER_OF_FIGURES = 5;

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[NUMBER_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = figureSupplier.getRandomFigure();
            figuresArray[i].draw();
        }
    }
}
