package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figure.getRandomFigure();
                continue;
            }
            figures[i] = figure.getDefaultFigure();
        }

        for (Figure shape : figures) {
            shape.draw();
        }
    }
}
