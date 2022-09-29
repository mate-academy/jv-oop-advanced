package core.basesyntax;

public class Main {
    private static final int ARRAY_LENGTH = 6;
    private static final int LAST_THREE_POSITIONS = 3;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i >= LAST_THREE_POSITIONS) {
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
