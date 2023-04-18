package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        int i;
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] arrayFigurs = new Figure[20] ;
        for ( i = 0; i < 10; i++) {
            arrayFigurs[i] = figureSupplier.getRandomFigureName();
        }
        for (int j = i; j < 20; j++) {
            arrayFigurs[j] = figureSupplier.getDefaultFigure();
        }
    }
}
