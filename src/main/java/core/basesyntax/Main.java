package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier randomFigure = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = randomFigure.getRandomFigure();
            } else {
                figures[i] = randomFigure.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
