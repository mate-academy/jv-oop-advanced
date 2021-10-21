package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_LENGTH = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_LENGTH_OF_SIDE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURES_LENGTH);
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomTriangle();
            case 4:
            default:
                return getRandomTrapezoid();
        }
    }

    public Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor().toString();
        int radius = random.nextInt(MAX_LENGTH_OF_SIDE);
        return new Circle(color, radius);
    }

    public Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor().toString();
        int side = random.nextInt(MAX_LENGTH_OF_SIDE);
        return new Square(color, side);
    }

    public Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor().toString();
        int firstLeg = random.nextInt(MAX_LENGTH_OF_SIDE);
        int secondLeg = random.nextInt(MAX_LENGTH_OF_SIDE);
        return new Rectangle(color, firstLeg, secondLeg);
    }

    public Figure getRandomTriangle() {
        String color = colorSupplier.getRandomColor().toString();
        int side = random.nextInt(MAX_LENGTH_OF_SIDE);
        return new RightTriangle(color, side);
    }

    public Figure getRandomTrapezoid() {
        String color = colorSupplier.getRandomColor().toString();
        int topSide = random.nextInt(MAX_LENGTH_OF_SIDE);
        int downSide = random.nextInt(MAX_LENGTH_OF_SIDE);
        int height = random.nextInt(MAX_LENGTH_OF_SIDE);
        return new IsoscelesTrapezoid(color, topSide, downSide, height);
    }

    public Figure getDefaultFigure() {
        String defaultColor = Color.WHITE.toString().toLowerCase();
        return new Circle(defaultColor, DEFAULT_RADIUS);
    }
}
