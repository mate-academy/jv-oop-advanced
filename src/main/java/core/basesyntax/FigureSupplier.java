package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Square createSquare() {
        return new Square(colorSupplier.getRandomColor());
    }

    private RightTriangle createRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor());
    }

    private Rectangle createRectangle() {
        return new Rectangle(colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor());
    }

    private Circle createCircle() {
        return new Circle(colorSupplier.getRandomColor());
    }

    public String getRandomFigure() {
        int randomNumber = random.nextInt(5);

        switch (randomNumber) {
            case 0:
                return createSquare().draw() + ", color: "
                       + colorSupplier.getRandomColor().name().toLowerCase();
            case 1:
                return createRightTriangle().draw() + ", color: "
                       + colorSupplier.getRandomColor().name().toLowerCase();
            case 2:
                return createRectangle().draw() + ", color: "
                       + colorSupplier.getRandomColor().name().toLowerCase();
            case 3:
                return createIsoscelesTrapezoid().draw() + ", color: "
                       + colorSupplier.getRandomColor().name().toLowerCase();
            default:
                return createCircle().draw() + ", color: "
                       + colorSupplier.getRandomColor().name().toLowerCase();
        }
    }

    public String getDefaultFigure() {
        double radius = 10;
        double area = Math.PI * radius;
        return String.format("Figure: circle, area: %.2f sq.units, "
                + "radius: %.2f units, color: white", area, Math.PI * radius);
    }

}
