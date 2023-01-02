package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] arr = {new FigureSupplier().getRandomFigure(), new FigureSupplier().getRandomFigure(),
                new FigureSupplier().getRandomFigure(), FigureSupplier.getDefaultFigure(),
                FigureSupplier.getDefaultFigure(), FigureSupplier.getDefaultFigure()};
    }
}
