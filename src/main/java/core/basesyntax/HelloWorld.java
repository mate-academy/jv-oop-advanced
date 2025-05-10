package core.basesyntax;

public class HelloWorld {
    private static final int count = 10;

    public static void main(String[] args) {
        FigureSupplier randomFigure = new FigureSupplier();
        Figure[] figures = new Figure[count];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < figures.length / 2) ? randomFigure.getRandomFigure()
                    : randomFigure.getDefaultFigure();
        }
        for (Figure f : figures) {
            f.drawFigure();
        }
    }
}
