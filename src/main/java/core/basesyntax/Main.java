package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures [i] = figureSupplier.getRandomFigure(figureSupplier.getRandomFigureType());
            } else {
                figures [i] = figureSupplier.getDefaultFigure();
            }
            System.out.println(figures[i].draw());
        }
    }
}
