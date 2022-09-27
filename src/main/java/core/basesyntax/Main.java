package core.basesyntax;

public class Main {
    private static final int taskNumber = 6;

    public static void main(String[] args) {

        Figure[] figures = new Figure[taskNumber];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i <= figures.length / 2 - 1) {
                figures[i] = figureSupplier.whichFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure fig: figures) {
            fig.infoAboutFigure();
        }
    }
}
