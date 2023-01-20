package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int Figure_Count = 6;
        FigureSupplier supplier = new FigureSupplier();

        Figure[] figures = new Figure[Figure_Count];
        for (int i = 0; i < figures.length; i++) {
            if (i < (figures.length / 2)) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
            figures[i].getInfo();
        }
    }
}
