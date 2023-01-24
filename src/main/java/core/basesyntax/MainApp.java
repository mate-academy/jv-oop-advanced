package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Figure[] figure = new Figure[]{
                new FigureSupplier().getDefaultFigure(),
                new FigureSupplier().getDefaultFigure(),
                new FigureSupplier().getDefaultFigure(),
                new FigureSupplier().getRandomFigure(),
                new FigureSupplier().getRandomFigure(),
                new FigureSupplier().getRandomFigure()};

        for (int i = 0; i < figure.length; i++) {
            figure[i].draw();
        }
    }
}
