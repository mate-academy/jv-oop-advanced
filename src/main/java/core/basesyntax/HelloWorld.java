package core.basesyntax;

public class HelloWorld {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[3];
        figures[0] = figureSupplier.getRandomFigure();
        figures[1] = figureSupplier.getRandomFigure();
        figures[2] = figureSupplier.getDefaultFigure();
        figures[0].draw();
        figures[1].draw();
        figures[2].draw();
    }
}
