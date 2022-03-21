package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure [] result = new Figure[6];
        for (int i = 0; i < result.length; i++) {
            if (i >= result.length / 2) {
                result[i] = new FigureSupplier().getDefaultFigure();
                result[i].draw();
            } else {
                result[i] = new FigureSupplier().getRandomFigure();
                result[i].draw();
            }
        }
    }
}
