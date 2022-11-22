package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < shapes.length / 2; i++) {
            shapes[i] = figureSupplier.getRandomFigure();
            shapes[i].drawShape();
        }
        for (int i = 3; i < shapes.length; i++) {
            shapes[i] = figureSupplier.getDefaultFigure();
            shapes[i].drawShape();
        }
    }
}
