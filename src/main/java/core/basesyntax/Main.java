package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier newRandomFigure = new FigureSupplier();
        RandomFigure[] figures = new RandomFigure[6];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = newRandomFigure.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = newRandomFigure.getDefaultFigure();
        }
        for (Draw figure : figures) {
            figure.draw();
        }
    }
}
