package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        Figure[] figures = new Figure[6];
        int defaultFigureIndex = figures.length / 2;

        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < defaultFigureIndex) ? figureSupplier.getRandomFigure() : figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}


