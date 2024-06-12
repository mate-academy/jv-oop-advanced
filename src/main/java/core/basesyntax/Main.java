package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[10];

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                figures[i] = FigureSupplier.getRandomFigure();
            } else {
                figures[i] = FigureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
