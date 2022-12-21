package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figs = new Figure[10];
        for (int i = 0; i < figs.length; i++) {
            if (i < figs.length / 2) {
                figs[i] = new FigureSupplier().getRandomFigure();
                System.out.println(figs[i].draw());
            } else {
                figs[i] = new FigureSupplier().getDefaultFigure();
                System.out.println(figs[i].draw());
            }
        }
    }
}
