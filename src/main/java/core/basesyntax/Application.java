package core.basesyntax;

public class Application {
    public static void main(String [] main) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figureArray = new Figure[6];
        for (int i = 0; i < figureArray.length; i++) {
            if (i < 3) {
                figureArray[i] = figureSupplier.getRandomFigure();
                System.out.println(figureArray[i].draw());
            }
            if (i >= 3) {
                figureArray[i] = figureSupplier.getDefaultFigure();
                System.out.println(figureArray[i].draw());
            }
        }
    }
}

