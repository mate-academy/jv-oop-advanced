package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private String[] figureTypes = {"Circle", "IsoscelesTrapezoid", "Rectangle",
            "RightTriangle", "Square"};
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (figureTypes[random.nextInt(figureTypes.length)]) {
            case "Circle":
                return getRandomCircle();
            case "Rectangle":
                return getRandomRectangle();
            case "RightTriangle":
                return getRandomRightTriangle();
            case "Square":
                return getRandomSquare();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextDouble());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextDouble());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextDouble(), random.nextDouble());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble(), random.nextDouble());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble(), random.nextDouble());
    }
}
