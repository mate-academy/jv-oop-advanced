package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] defaultFigures = figureSupplier.getDefaultFigure();
        Figure[] randomFigures = figureSupplier.getRandomFigure();

        for (Figure figure : randomFigures) {
            System.out.println(figure.draw());
        }

        for (Figure figure : defaultFigures) {
            System.out.println(figure.draw());
        }
    }
}
