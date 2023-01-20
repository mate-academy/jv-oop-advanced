package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int quantityFigures = 6;
        Figure[] figuresAll = new Figure[quantityFigures];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresAll.length; i++) {
            if (i < figuresAll.length / 2) {
                figuresAll[i] = figureSupplier.getRandomFigure();
            } else {
                figuresAll[i] = figureSupplier.getDefaultFigure();
            }
            figuresAll[i].draw();
        }
    }
}
