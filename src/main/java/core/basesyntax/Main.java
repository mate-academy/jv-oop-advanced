package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int figureCount = (int) (Math.random() * 100 + 1);
        FigureSupplier suppliers = new FigureSupplier();
        Figure[] figures = new Figure[figureCount];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = suppliers.createRandomFigure();
            figures[i].drawFigure();
        }
    }
}
