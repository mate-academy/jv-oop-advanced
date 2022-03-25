package core.basesyntax;

public class Main {
    private static final int LOOP = 6;

    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        for (int i = 0; i < LOOP; i++) {
            if (i < LOOP / 2) {
                System.out.println(figure.getRandomFigure());
            } else {
                System.out.println(figure.getDefaultFigure());
            }
        }
    }
}
