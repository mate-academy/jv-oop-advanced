package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[10];
        for (int i = 0; i < 10; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].setColour(colorSupplier.getRandomColour());
            figures[i].draw();
        }
    }

}
