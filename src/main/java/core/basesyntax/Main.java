package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 6; i++) {
            System.out.println(i > 2 ? figureSupplier.getDefaultFigure().draw()
                                     : figureSupplier.getRandomFigure().draw());
        }
    }
}
