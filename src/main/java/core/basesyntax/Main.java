package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < (figures.length / 2)) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].draw());
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].draw());
            }
        }
    }
}
