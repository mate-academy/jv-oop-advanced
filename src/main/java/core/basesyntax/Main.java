package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        figures[5] = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), 10, 20, 15);

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
