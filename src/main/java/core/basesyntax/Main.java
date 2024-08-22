package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int figuresCapacity = 6;
        int randomFiguresThreshold = 3;
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[figuresCapacity];

        for (int i = 0; i < figuresCapacity; i += 1) {
            if (i < randomFiguresThreshold) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.drawArea();
        }
    }
}
