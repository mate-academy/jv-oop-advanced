package core.basesyntax;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DIMENSION_MAX_VALUE = 100;

    public static Figure getRandomFigure() {
        int random = 1 + (int)(Math.random() * FIGURE_COUNT);
        int dimension1 = 1 + (int)(Math.random() * DIMENSION_MAX_VALUE);
        int dimension2 = 1 + (int)(Math.random() * DIMENSION_MAX_VALUE);
        int dimension3 = 1 + (int)(Math.random() * DIMENSION_MAX_VALUE);

        switch (random) {
            case 1:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),dimension1,dimension2,dimension3);
            case 2:
                return new Circle(ColorSupplier.getRandomColor(),dimension1);
            case 3:
                return new RightTriangle(ColorSupplier.getRandomColor(),dimension1);
            case 4:
                return new Rectangle(ColorSupplier.getRandomColor(),dimension1,dimension2);
            case 5:
                return new Square(ColorSupplier.getRandomColor(),dimension1);
            default:
                System.out.println("Something wrong with figure number randomizer, you'll get default figure");
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),1,2,3);
        }
    }
}
