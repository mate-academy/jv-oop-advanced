package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2 - 1 ? figureSupplier.getDefaultFigure()
                    : figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.printInfo();
        }
    }
}
