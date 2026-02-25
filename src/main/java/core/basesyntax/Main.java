package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[6];
        figureArray[0] = figureSupplier.getDefaultFigure();
        figureArray[1] = figureSupplier.getDefaultFigure();
        figureArray[2] = figureSupplier.getDefaultFigure();
        figureArray[3] = figureSupplier.getRandomFigure();
        figureArray[4] = figureSupplier.getRandomFigure();
        figureArray[5] = figureSupplier.getRandomFigure();
        for (Figure fig : figureArray) {
            fig.draw();
        }
    }
}
