package core.basesyntax;

import java.util.Random;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    private static Random random = new Random();

    public static void main(String[] args) {
        FigureForm[] array = new FigureForm[5];
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = figureSupplier.getRandomFigure(random.nextInt(5));
            if (array[i].equals(FigureSupplier.circle)) {
                FigureSupplier.circle.draw();
            }
            if (array[i].equals(FigureSupplier.isoscelesTrapezoid)) {
                FigureSupplier.isoscelesTrapezoid.draw();
            }
            if (array[i].equals(FigureSupplier.rectangle)) {
                FigureSupplier.rectangle.draw();
            }
            if (array[i].equals(FigureSupplier.rightTriangle)) {
                FigureSupplier.rightTriangle.draw();
            }
            if (array[i].equals(FigureSupplier.square)) {
                FigureSupplier.square.draw();
            }
        }
        for (int j = array.length / 2; j < array.length; j++) {
            figureSupplier.getDefaultFigure().draw();
        }
        System.out.println();
    }
}
