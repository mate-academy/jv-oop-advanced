package core.basesyntax;

public class HelloWorld {
    public static final int radius = 15;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[5];
        for (int i = 0; i <= 4; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        figures[4] = new Circle("White", radius);
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
