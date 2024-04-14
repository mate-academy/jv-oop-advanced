package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int numberOfFigures = 5; //Square, Rectangle, RightTriangle, Circle, IsoscelesTrapezoid
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2 ? figureSupplier.getRandomFigure(numberOfFigures)
                    : figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
