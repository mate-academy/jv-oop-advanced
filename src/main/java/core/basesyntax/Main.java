package core.basesyntax;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        for (int i = 0; i < figures.length; i++) {
            Figure figure = i < figures.length / 2 ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figure.draw();
        }
    }
}
