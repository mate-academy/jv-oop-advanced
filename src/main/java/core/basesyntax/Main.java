package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = { figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(), figureSupplier.getDefaultFigure() };
        for (Figure f : figures) {
            f.draw();
        }
    }
}
