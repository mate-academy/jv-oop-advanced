package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        AbstractFigure[] figures = new AbstractFigure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            if (figures[i] != null) {
                System.out.println(figures[i].draw());
            }
        }
    }
}



