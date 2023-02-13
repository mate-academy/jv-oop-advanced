package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[10];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        Figure defaultFigure = figureSupplier.getDefaultFigure();
        defaultFigure.draw();
    }
}
