package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int numberOfFigures = 5;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[numberOfFigures];

        for (int i = 0; i < numberOfFigures; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println(figures[i].draw());
        }
    }
}
