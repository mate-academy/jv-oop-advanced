package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSuplier newFigure = new FigureSuplier();
        Figure[] figures = new Figure[5];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = newFigure.getRandomFigure();
            } else {
                figures[i] = newFigure.getDefaultFigure();
            }
            figures[i].drawFigure();
        }
    }
}
