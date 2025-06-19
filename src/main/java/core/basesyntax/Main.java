package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 3; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
            figures[i].drawArea();
        }
        for (int i = 3; i < 6; i++) {
            figures[i] = new FigureSupplier().getDefaultFigure();
            figures[i].drawArea();
        }
    }
}
