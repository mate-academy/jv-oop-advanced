package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 4;
    private static Random random = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                int sideOfSquare = random.nextInt(10);
                return new Square(sideOfSquare,
                        colorSupplier.getRandomColor());
            case 1:
                int firstSideOfRectangle = random.nextInt(10);
                int secondSideOfRectangle = random.nextInt(10);
                return new Rectangle(firstSideOfRectangle,
                        secondSideOfRectangle,
                        colorSupplier.getRandomColor());
            case 2:
                int firstLegOfTriangle = random.nextInt(10);
                int secondLegOfTriangle = random.nextInt(10);
                return new RightTriangle(firstLegOfTriangle,
                        secondLegOfTriangle,
                        colorSupplier.getRandomColor());
            case 3:
                int radiusOfCircle = random.nextInt(10);
                return new Circle(radiusOfCircle,
                        colorSupplier.getRandomColor());
            case 4:
                int firstBaseOfTrapezoid = random.nextInt(10);
                int secondBaseOfTrapezoid = random.nextInt(10);
                int legOfTrapezoid = random.nextInt(10);
                return new IsoscelesTrapezoid(firstBaseOfTrapezoid,
                        secondBaseOfTrapezoid,
                        legOfTrapezoid,
                        colorSupplier.getRandomColor());
            default:
                return new Circle(10,
                        Color.WHITE.name());
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
