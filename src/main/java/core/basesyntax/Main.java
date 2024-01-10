package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure [] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        figures[0] = figureSupplier.getRandomFigure();
        figures[1] = figureSupplier.getRandomFigure();
        figures[2] = figureSupplier.getRandomFigure();
        figures[3] = figureSupplier.getDefaultFigure();
        figures[4] = new Rectangle("GREEN", 3,6);
        figures[5] = new IsoscelesTrapezoid("ORANGE", 9, 5,4);
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
