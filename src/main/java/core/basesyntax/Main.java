package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int figureCount = (int) (Math.random() * 100 + 1);
        FigureSuppliers suppliers = new FigureSuppliers();
        Figure[] figures = new Figure[figureCount];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = suppliers.createRandomFigure();
            figures[i].drawFigure();
        }
    }
}
