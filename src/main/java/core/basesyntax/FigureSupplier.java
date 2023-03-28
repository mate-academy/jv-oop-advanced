package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Square createSquare() {
        return new Square(colorSupplier.getRandomColor(),
                10 * random.nextDouble());
    }

    private RightTriangle createRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                10 * random.nextDouble(), 10 * random.nextDouble());
    }

    private Rectangle createRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                10 * random.nextDouble(), 10 * random.nextDouble());
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                10 * random.nextDouble(), 10 * random.nextDouble());
    }

    private Circle createCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                10 * random.nextDouble());
    }

    public String getRandomFigure() {
        int randomNumber = random.nextInt(5);

        switch (randomNumber) {
            case 0:
                return createSquare().draw();
            case 1:
                return createRightTriangle().draw();
            case 2:
                return createRectangle().draw();
            case 3:
                return createIsoscelesTrapezoid().draw();
            default:
                return createCircle().draw();
        }
    }

    public String getDefaultFigure() {
        final double defaultRadius = 10.0;
        final String defaultColor = "white";
        final Circle circle = new Circle(defaultColor, defaultRadius);
        return circle.draw();
    }
}
