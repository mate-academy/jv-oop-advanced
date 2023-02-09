package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2 ? figureSupplier.getRandomFigure()
                : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
