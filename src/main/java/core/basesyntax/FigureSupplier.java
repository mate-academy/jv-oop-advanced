package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 4;
    private static final int MAX_NUMBER = 10;
    private static final int CIRCLE_RADIUS = 10;
    private static Random random = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                int sideOfSquare = random.nextInt(MAX_NUMBER) + 1;
                return new Square(sideOfSquare,
                        colorSupplier.getRandomColor());
            case 1:
                int firstSideOfRectangle = random.nextInt(MAX_NUMBER) + 1;
                int secondSideOfRectangle = random.nextInt(MAX_NUMBER) + 1;
                return new Rectangle(firstSideOfRectangle,
                        secondSideOfRectangle,
                        colorSupplier.getRandomColor());
            case 2:
                int firstLegOfTriangle = random.nextInt(MAX_NUMBER) + 1;
                int secondLegOfTriangle = random.nextInt(MAX_NUMBER) + 1;
                return new RightTriangle(firstLegOfTriangle,
                        secondLegOfTriangle,
                        colorSupplier.getRandomColor());
            case 3:
                int radiusOfCircle = random.nextInt(MAX_NUMBER) + 1;
                return new Circle(radiusOfCircle,
                        colorSupplier.getRandomColor());
            case 4:
                int firstBaseOfTrapezoid = random.nextInt(MAX_NUMBER) + 1;
                int secondBaseOfTrapezoid = random.nextInt(MAX_NUMBER) + 1;
                int legOfTrapezoid = random.nextInt(MAX_NUMBER) + 1;
                return new IsoscelesTrapezoid(firstBaseOfTrapezoid,
                        secondBaseOfTrapezoid,
                        legOfTrapezoid,
                        colorSupplier.getRandomColor());
            default:
                return new Circle(CIRCLE_RADIUS,
                        Color.WHITE.name());
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, Color.WHITE.name());
    }
}
