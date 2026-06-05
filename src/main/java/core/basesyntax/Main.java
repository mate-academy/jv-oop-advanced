package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] array = new Figure[6];
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                System.out.println(figureSupplier.getRandomFigure().draw());
            } else {
                System.out.println(figureSupplier.getDefaultFigure().draw());
            }
        }
    }
}
