package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].setColor(colorSupplier.getRandomColor());
        }

        for (int i = 3; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure currentFigure : figures) {
            currentFigure.draw();
        }

    }

}
