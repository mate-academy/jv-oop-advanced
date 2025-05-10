package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[6];
        for (int i = 0; i < figureArray.length / 2; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figureArray.length / 2; i < figureArray.length; i++) {
            figureArray[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figureArray) {
            figure.draw();
        }
    }
}
