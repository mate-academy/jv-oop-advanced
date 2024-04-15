package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].toString());
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].toString());
            }

        }
    }
}