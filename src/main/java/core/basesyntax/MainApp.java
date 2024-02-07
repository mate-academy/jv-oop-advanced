package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[]{
                figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure()};
        for (Figure value : figure) {
            value.draw();
        }
    }
}
