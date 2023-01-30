package core.basesyntax;

import java.util.Random;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static Random random = new Random();

    public static void main(String[] args) {
        FigureForm[] array = new FigureForm[5];
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = figureSupplier.getRandomFigure(random.nextInt(5));
            if (array[i].equals(FigureSupplier.circle)) {
                assert FigureSupplier.circle != null;
                FigureSupplier.circle.draw();
            }
            if (array[i].equals(FigureSupplier.isoscelesTrapezoid)) {
                assert FigureSupplier.isoscelesTrapezoid != null;
                FigureSupplier.isoscelesTrapezoid.draw();
            }
            if (array[i].equals(FigureSupplier.rectangle)) {
                assert FigureSupplier.circle != null;
                FigureSupplier.rectangle.draw();
            }
            if (array[i] == FigureSupplier.rightTriangle) {
                assert FigureSupplier.circle != null;
                FigureSupplier.rightTriangle.draw();
            }
            if (array[i] == FigureSupplier.square) {
                assert FigureSupplier.circle != null;
                FigureSupplier.square.draw();
            }
        }
        for (int j = array.length / 2; j < array.length; j++) {
            Circle circle1 = new Circle(10, "WHITE");
            circle1.draw();
        }
        System.out.println();
    }
}
