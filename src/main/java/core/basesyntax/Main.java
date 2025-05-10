package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int numberFigures = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[numberFigures];
        for (int i = 0; i < numberFigures; i++) {
            figureArray[i] = numberFigures / 2 > i
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
        }
        for (Figure figure:
                figureArray) {
            System.out.println(figure.draw());
        }
    }
}
