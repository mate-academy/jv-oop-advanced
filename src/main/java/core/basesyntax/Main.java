package core.basesyntax;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println(figureSupplier.getRandomFigure().draw());
        }
    }
}
