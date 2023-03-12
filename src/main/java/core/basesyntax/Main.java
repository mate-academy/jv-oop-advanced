package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[10];
        for (int i = 0; i < 10; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }

        Figure[] defaultFigures = new Figure[3];
        for (int i = 0; i < 3; i++) {
            defaultFigures[i] = FigureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
        for (Figure figure : defaultFigures) {
            figure.draw();
        }
    }
}
