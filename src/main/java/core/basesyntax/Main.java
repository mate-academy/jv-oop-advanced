package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayFig = new Figure[10];
        for (int i = 0; i < arrayFig.length ; i++) {
            if (i < arrayFig.length / 2 ) {
                arrayFig[i] = figureSupplier.getDefaultFigure();
            } else {
                arrayFig[i] = figureSupplier.getRandomFigure();
            }
        }
        for (Figure fig : arrayFig) {
            System.out.println(fig);
        }
    }
}
