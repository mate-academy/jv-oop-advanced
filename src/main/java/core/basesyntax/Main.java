package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().figureGenerator();
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i].drawFigure();
        }
    }
}
