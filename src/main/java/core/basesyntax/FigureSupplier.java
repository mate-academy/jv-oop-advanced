package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.random = new Random();
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        FigureType figureType = FigureType.values()[index];
        return generateFigureByType(figureType);
    }

    public Figure generateFigureByType(FigureType figureType) {
        switch (figureType) {
            case CIRCLE:
                String color = colorSupplier.getRandomColor();
                int radius = random.nextInt(BOUND);
                return new Circle(color, radius);
            case SQUARE:
                String colorSquare = colorSupplier.getRandomColor();
                int side = random.nextInt(BOUND);
                return new Square(colorSquare, side);
            case RECTANGLE:
                String colorRectangle = colorSupplier.getRandomColor();
                int width = random.nextInt(BOUND);
                int longitude = random.nextInt(BOUND);
                return new Rectangle(colorRectangle, width, longitude);
            case RIGHT_TRIANGLE:
                String colorRightTriangle = colorSupplier.getRandomColor();
                int firstLeg = random.nextInt(BOUND);
                int secondLeg = random.nextInt(BOUND);
                return new RightTriangle(colorRightTriangle, firstLeg, secondLeg);
            default:
                String colorIsoscelesTrapezoid = colorSupplier.getRandomColor();
                int firstSide = random.nextInt(BOUND);
                int secondSide = random.nextInt(BOUND);
                int heigth = random.nextInt(BOUND);
                return new IsoscelesTrapezoid(colorIsoscelesTrapezoid, firstSide,
                        secondSide, heigth);
        }
    }
}
