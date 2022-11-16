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
        for (int x = figures.length / 2; x < figures.length; x++) {
            figures[x] = figureSupplier.getDefaultFigure();
            figures[x].draw();
        }
    }
}
