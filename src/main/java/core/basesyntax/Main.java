package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        int numberOfFigures = 6;

        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < numberOfFigures; i++) {
            if (i < numberOfFigures / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].setColor(colorSupplier.getRandomColor());
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure currentFigure : figures) {
            currentFigure.draw();
        }
    }
}
