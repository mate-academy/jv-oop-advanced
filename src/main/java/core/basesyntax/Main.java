package core.basesyntax;

public class Main {
    private static final int COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        Figure[] figures = new Figure[COUNT];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = fs.getRandomFigure();
        }

        for (Figure figure : figures) {
            figure.drawFigure();
        }
    }
}
