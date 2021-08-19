package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Randomizer randomizer = new Randomizer();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[randomizer.getRandomNumber(1, 5)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
