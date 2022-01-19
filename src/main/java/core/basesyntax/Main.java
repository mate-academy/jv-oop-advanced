package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int randomArrayLength = figureSupplier.getRandomNumber();
        Figure[] figures = new Figure[randomArrayLength];

        for (int i = 0; i < randomArrayLength; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println(figures[i].draw());
        }
    }
}
