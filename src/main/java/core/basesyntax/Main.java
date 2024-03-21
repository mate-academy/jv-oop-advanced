package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayOfFigures = new Figure[6];
        for (int i = 0; i < arrayOfFigures.length; i++) {
            arrayOfFigures[i] = (i < 3) ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : arrayOfFigures) {
            figure.draw();
        }
    }
}
