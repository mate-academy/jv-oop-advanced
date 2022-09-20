package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int arrayNumber = 7;
        for (int i = 0; i < arrayNumber / 2; i++) {
            System.out.println(figureSupplier.getRandomFigure().draw());
        }
        for (int i = arrayNumber / 2; i < arrayNumber; i++) {
            System.out.println(figureSupplier.getDefaultFigure().draw());
        }
    }
}
