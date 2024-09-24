package core.basesyntax;

public class Main {
    private static final int COUNT_OF_FIGURE = 6;

    public static void main(String[] args) {

        FigureSupplier figureSuplier = new FigureSupplier();
        Figure[] allFigures = new Figure[COUNT_OF_FIGURE];
        for (int i = 0; i < allFigures.length; i++) {
            if (i < allFigures.length / 2) {
                allFigures[i] = figureSuplier.getRandomFigure();
            } else {
                allFigures[i] = figureSuplier.getDefaultFigure();
            }
            allFigures[i].drawFigure();
        }
    }
}
