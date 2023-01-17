package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int QUANTITYFIGURES = 6;
        Figure[] figuresAll = new Figure[QUANTITYFIGURES];
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
