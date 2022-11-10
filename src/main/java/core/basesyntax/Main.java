package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        for (int i = 0; i < 3; i++) {
            FigureSupplier figure1 = new FigureSupplier();
            Figure result = figure1.getRandomFigure();
            result.area();
            result.draw();
        }
        for (int i = 0; i < 3; i++) {
            Figure result = figure.getDefaultCircle();
            result.draw();
        }
    }
}
