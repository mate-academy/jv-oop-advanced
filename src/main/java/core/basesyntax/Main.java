package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i=1; i <= 5; i++) {
            System.out.println(figureSupplier.getRandomFigure().draw());
        }
        System.out.println(figureSupplier.getDefaultFigure().draw());
    }
}
