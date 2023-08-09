package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String COLOR = Color.WHITE.name();
    private static final int CIRCLE_DEFAULT_RADIUS = 10;
    private static final int MAX_VALUE = 30;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final String[] usedFigures = {"Circle", "Square", "Rectangle", "RightTriangle",
            "IsoscelesTraezoid"};

    public Figure getRandomFigure() {
        int index = random.nextInt(usedFigures.length);
        String figureBuilding = usedFigures[index];
        switch (figureBuilding) {
            case "Circle":
                return getCircle();
            case "Square":
                return getSquare();
            case "Rectangle":
                return getRectangle();
            case "RightTriangle":
                return getRightTriangle();
            case "IsoscelesTraezoid":
                return getIsoscelesTrapezoid();
        }
        return null;
    }

    private Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomValue());
    }

    private Square getSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomValue());
    }

    private Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomValue(), getRandomValue());
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomValue(), getRandomValue());
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomValue(),
                getRandomValue(), getRandomValue());
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR, CIRCLE_DEFAULT_RADIUS);
    }

    private int getRandomValue() {
        return random.nextInt(MAX_VALUE);
    }
}
