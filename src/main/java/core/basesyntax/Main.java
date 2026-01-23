package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int totalFigures = figureSupplier.getFiguresCount();
        Figure[] figures = new Figure[totalFigures];

        int half = totalFigures / 2;

        for (int i = 0; i < half; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = half; i < totalFigures; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
