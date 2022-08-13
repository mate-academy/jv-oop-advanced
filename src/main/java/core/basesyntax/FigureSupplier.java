package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int maxValuesOfUnits = 10;
    public static final int minValuesOfUnits = 1;
    private Random random = new Random();

    public Figure getRandomFigure() {
        FigureList[] figureLists = FigureList.values();
        String nameOfFigure = String.valueOf(figureLists[random.nextInt(figureLists.length)]);
        if (nameOfFigure.equals("square")) {
            return new Square((random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                    new ColorSupplier().getRandomColor());
        }
        if (nameOfFigure.equals("rectangle")) {
            return new Rectangle((random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                    (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                    new ColorSupplier().getRandomColor());
        }
        if (nameOfFigure.equals("rightTriangle")) {
            return new RightTriangle((random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                    new ColorSupplier().getRandomColor());
        }
        if (nameOfFigure.equals("circle")) {
            return new Circle((random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                    new ColorSupplier().getRandomColor());
        }
        if (nameOfFigure.equals("isoscelesTrapezoid")) {
            return new IsoscelesTrapezoid(
                    (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                    (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                    (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                    new ColorSupplier().getRandomColor());
        }
        return new Circle(10, "WHITE");
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
