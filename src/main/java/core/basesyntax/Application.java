package core.basesyntax;

public class Application extends FigureSupplier {
    public static void main(String[] args) {
        final int areaSize = 6;
        Figure[] figures = new Figure[areaSize];
        for (int i = 0; i < 3; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
            figures[i + 3] = new FigureSupplier().getDefaultFigure();
        }

        for (Figure figure: figures) {
            System.out.println(figure.figureDescription());
        }
    }
}
