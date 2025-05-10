package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier newFigure = new FigureSupplier();
        Figure[] figures = new Figure[3];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = newFigure.getRandomFigure();
            } else {
                figures[i] = newFigure.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
