package core.basesyntax;

public class Application {

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i <= figures.length / 2 - 1) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].draw());
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].draw());
            }
        }
    }
}
