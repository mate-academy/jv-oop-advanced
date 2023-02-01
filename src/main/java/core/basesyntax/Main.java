package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure randomFigure = figureSupplier.getRandomFigure();
        Figure defeultFigure = figureSupplier.getDefaultFigure();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].getDraw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                defeultFigure.getDraw();
            }
        }
    }
}
