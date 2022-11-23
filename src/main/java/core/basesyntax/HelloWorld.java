package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figureArray = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figureArray.length; i++) {
            if (i < 3) {
                figureArray[i] = figureSupplier.getRandomFigure();
            } else {
                figureArray[i] = figureSupplier.getDefaultFigure();
            }
            figureArray[i].draw();
        }
    }
}
