package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure defaultFigure = figureSupplier.getDefaultFigure();
        figures[0] = defaultFigure;
        for (int i = 1; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for(Figure result: figures) {
            result.draw();
        }
    }
}
