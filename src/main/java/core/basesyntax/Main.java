package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayFigures = new Figure[6];
        for (int i = 0; i < arrayFigures.length; i++) {
            arrayFigures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : arrayFigures) {
            System.out.println(figure.draw());
        }
    }
}
