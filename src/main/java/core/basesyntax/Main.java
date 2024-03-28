package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        int firstHalf = figures.length / 2;

        FigureSupplier randomSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < firstHalf) {
                figures[i] = randomSupplier.getRandomFigure();
            } else {
                figures[i] = randomSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
