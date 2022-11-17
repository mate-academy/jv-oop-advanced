package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        int figureNumber = 6;
        Figure[] figures = new Figure[figureNumber];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        int defaultFigures = 3;
        while (defaultFigures < figures.length) {
            figures[defaultFigures] = figureSupplier.getDefaultFigure();
            figures[defaultFigures].draw();
            defaultFigures++;
        }
    }
}
