package core.basesyntax;

public class Main {

    private static final int AMOUNT = 10;
    public static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figs = new Figure[AMOUNT];
        for (int i = 0; i < figs.length; i++) {
            if (i < figs.length / 2) {
                figs[i] = FIGURE_SUPPLIER.getRandomFigure();
                System.out.println(figs[i].draw());
            } else {
                figs[i] = FIGURE_SUPPLIER.getDefaultFigure();
                System.out.println(figs[i].draw());
            }
        }
    }
}
