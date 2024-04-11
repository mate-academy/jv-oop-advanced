package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2
                    ? FigureSupplier.getRandomFigure() : FigureSupplier.getDefaultFigure();
        }

        for (ToDraw figure : figures) {
            figure.draw();
        }
    }
}
