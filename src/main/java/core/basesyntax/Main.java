package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        for (int i = 0; i < 10; i++) {
            Figure figure = figureSupplier.getRandomFigure();
            figure.draw();
        }
    }
}
