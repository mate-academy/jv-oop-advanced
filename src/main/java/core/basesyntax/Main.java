package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = figureSupplier.getRandomArrayOfFigures();
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
