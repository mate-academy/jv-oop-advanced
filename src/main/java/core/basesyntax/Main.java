package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figureArray = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figureArray.length; i++) {
            if (i < figureArray.length / 2) {
                figureArray[i] = figureSupplier.getRandomFigure();
            } else {
                figureArray[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: figureArray) {
            figure.draw();
        }
    }
}
