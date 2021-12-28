package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier factory = new FigureSupplier();
        Figure[] figureArr = new Figure[6];
        for (int i = 0; i < figureArr.length; i++) {
            if (i < figureArr.length / 2) {
                figureArr[i] = factory.getRandomFigure();
            } else {
                figureArr[i] = factory.getDefaultFigure();
            }
        }
        for (int i = 0; i < figureArr.length; i++) {
            System.out.println(figureArr[i].draw());
        }
    }

}
