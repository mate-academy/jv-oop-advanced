package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        final int figuresTotal = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[figuresTotal];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i + figures.length / 2] = figureSupplier.getDefaultFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println("Figure: " + figures[i].draw());
        }
    }
}
