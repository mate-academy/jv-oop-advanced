package core.basesyntax;

public class RunApplication {
    private static FigureSupplier figureSuppluer = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSuppluer.getRandomFigure();
        }

        for (Figure figure: figures) {
            figure.toDraw();
        }
    }
}

