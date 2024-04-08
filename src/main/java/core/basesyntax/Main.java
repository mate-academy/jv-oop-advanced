package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure figures[] = new Figure[6];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getDefaultFigure();
        }
        for (Figure f : figures) {
            f.draw();
        }
    }
}
