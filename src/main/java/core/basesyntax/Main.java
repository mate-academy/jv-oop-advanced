package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        Figure[] figures = new Figure[6];

        for (int i = 0; i < 6; i++) {
            Figure figure;
            if (i < 3) {
                figure = (Figure) figureSupplier.getRandomFigure();
            } else {
                figure = (Figure) figureSupplier.getDefaultFigure();
            }
            figure.draw();
        }
    }
}

