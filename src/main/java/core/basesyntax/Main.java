package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        for (int i = 0; i < 3; i++) {
            figure.getRandomFigure().getArea();
            figure.getRandomFigure().draw();
        }
        for (int i = 0; i < 3; i++) {
            figure.getDefaultCircle().draw();
        }
    }
}
