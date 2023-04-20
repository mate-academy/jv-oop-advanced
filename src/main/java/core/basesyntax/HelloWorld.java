package core.basesyntax;

public class HelloWorld {
    private static final int countOfFigures = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[countOfFigures];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figures[i - countOfFigures / 2];
            }
            figures[i].getInfo();
        }

    }
}
