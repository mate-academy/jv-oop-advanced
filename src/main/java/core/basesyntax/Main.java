package core.basesyntax;

public class Main {
    public static final int COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[COUNT];
        for (int i = 0;i < figures.length;i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getFigureType();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
