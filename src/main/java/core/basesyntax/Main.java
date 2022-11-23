package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int figureNumber = 6;
        Figure[] figures = new Figure[figureNumber];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            }
        }
    }
}
