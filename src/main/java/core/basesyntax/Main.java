package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int FIGURES_COUNT = 6;
        Figure[] figuresArray = new Figure[FIGURES_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresArray.length; i++) {
            if (i < figuresArray.length / 2) {
                figuresArray[i] = figureSupplier.getRandomFigure();
                figuresArray[i].getDrawing();
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
                figuresArray[i].getDrawing();
            }
        }
    }
}
