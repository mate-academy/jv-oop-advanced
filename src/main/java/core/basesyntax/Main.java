package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figureArray = new Figure[3];
        for (int i = 0; i < figureArray.length; i++) {
            if (i <= figureArray.length / 2) {
                figureArray[i] = figureSupplier.getRandomFigure();
            } else {
                figureArray[i] = figureSupplier.getDefaultFigure();
            }
            figureArray[i].draw(figureArray[i]);
        }
    }
}
