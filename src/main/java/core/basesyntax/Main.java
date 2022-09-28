package core.basesyntax;

public class Main {
    private static final int NUMBER = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i >= 3) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }
        for (Figure fg : figures) {
            System.out.println(fg.printInfo());
        }

    }
}
