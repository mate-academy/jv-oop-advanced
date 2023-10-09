package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) { // констант
            if (i < 3) {
                figures[i] = FigureSupplier.getRandomFigure();
            }
            if (i >= 3) {
                figures[i] = FigureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
