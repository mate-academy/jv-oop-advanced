package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 3; i++) {
            figuresArray[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < 3; i++) {
            figuresArray[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figuresArray) {
            figure.figureInformation();
        }
    }
}
