package core.basesyntax;

public class Application {
    public static void main(String [] main) {
        FigureSupplier figurSuplier = new FigureSupplier();
        Figure [] figureArray = new Figure[6];
        for (int i = 0; i < figureArray.length; i++) {
            if (i < 3) {
                figureArray [i] = figurSuplier.getRandomFigure();
                System.out.println(figureArray[i].draw());
            }
            if (i >= 3) {
                figureArray[i] = figurSuplier.getDefaultFigure();
                System.out.println(figureArray[i].draw());
            }
        }
    }
}

