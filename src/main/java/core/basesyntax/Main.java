package core.basesyntax;

public class Main {
    static final int MAX_ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure[] figures = new Figure[MAX_ARRAY_LENGTH];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figure.getRandomFigure();
                continue;
            }
            figures[i] = figure.getDefaultFigure();
        }

        for (Figure shape : figures) {
            System.out.println(shape.draw());
        }
    }
}
