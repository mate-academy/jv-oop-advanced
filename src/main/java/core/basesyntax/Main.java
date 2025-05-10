package core.basesyntax;

public class Main {
    static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSuplier = new FigureSupplier();
        Figure[] allFigures = new Figure[ARRAY_SIZE];
        for (int i = 0; i < allFigures.length; i++) {
            if (i < allFigures.length / 2) {
                allFigures[i] = figureSuplier.getRandomFigure();
            } else {
                allFigures[i] = figureSuplier.getDefaultFigure();
            }
            allFigures[i].draw();
        }
    }
}
