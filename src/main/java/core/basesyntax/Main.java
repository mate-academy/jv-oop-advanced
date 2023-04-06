package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure defaultFigure = figureSupplier.getDefaultFigure();
        figures[0] = defaultFigure;
        System.out.println(defaultFigure.draw());
        for (int i = 1; i < 6; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println(figures[i].draw());
        }
    }
}
