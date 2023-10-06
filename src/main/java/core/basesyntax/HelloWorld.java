package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        final int radius = 15;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[5];
        for (int i = 0; i <= 4; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        figures[5] = new Circle("Black", radius);
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
