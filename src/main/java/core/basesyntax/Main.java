package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int figuresCount = 6;
        Figure [] figures = new Figure[figuresCount];
        for (int i = 0; i < figures.length; i++) {
            if (i % 2 == 0) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }
        for (Figure f : figures) {
            System.out.println(f);
        }
    }
}
