package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figureSuppliers = new Figure[6];
        for (int i = 0; i < figureSuppliers.length; i++) {
            if (i < 3) {
                figureSuppliers[i] = new FigureSupplier().getRandomFigure();
            } else {
                figureSuppliers[i] = new FigureSupplier().getDefaultFigure();
            }
        }
        for (int i = 0; i < figureSuppliers.length; i++) {
            figureSuppliers[i].drawFigure();
        }
    }
}
