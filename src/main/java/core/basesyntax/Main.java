package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] arrayFig = new Figure[10];
        for (int i = 0; i < arrayFig.length / 2; i++) {
            arrayFig[i] = FigureSupplier.getDefaultFigure();
        }
        for (int i = arrayFig.length / 2; i < arrayFig.length; i++) {
            arrayFig[i] = FigureSupplier.getRandomFigure();
        }
        for (Figure fig : arrayFig) {
            System.out.println(fig);
        }
    }
}
