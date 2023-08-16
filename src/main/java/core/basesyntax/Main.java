package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int totalFiguresAmount = 6;
        int firstHalf = 3;
        Figure[] figures = new Figure[totalFiguresAmount];
        for (int i = 0; i < figures.length; i++) {
            if (i < firstHalf) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
