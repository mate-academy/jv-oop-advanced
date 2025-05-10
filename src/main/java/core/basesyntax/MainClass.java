package core.basesyntax;

public class MainClass {
    private static final int MAGIC_NUMBER = 5;

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAGIC_NUMBER];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
