package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] arr = {Figure.getRandomFigure(), Figure.getRandomFigure(), Figure.getRandomFigure(),
                FigureSupplier.getDefaultFigure(), FigureSupplier.getDefaultFigure(), FigureSupplier.getDefaultFigure()};
    }
}
