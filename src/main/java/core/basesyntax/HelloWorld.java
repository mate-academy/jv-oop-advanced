package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = {new FigureSupplier().getRandomFigure(),
                            new FigureSupplier().getRandomFigure(),
                            new FigureSupplier().getRandomFigure(),
                            new FigureSupplier().getDefaultFigure(),
                            new FigureSupplier().getDefaultFigure(),
                            new FigureSupplier().getDefaultFigure()};

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
