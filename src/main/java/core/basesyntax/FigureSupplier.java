package core.basesyntax;

import java.util.Random;

class FigureSupplier {

    private final Random random = new Random();
    private final Square square;
    private final RightTriangle rightTriangle;
    private final Rectangle rectangle;
    private final IsoscelesTrapezoid isoscelesTrapezoid;
    private final Circle circle;
    private final DefaultFigure defaultFigure;

    FigureSupplier() {
        defaultFigure = new DefaultFigure("white");
        square = new Square(ColorSupplier.getRandomColor());
        circle = new Circle(ColorSupplier.getRandomColor());
        isoscelesTrapezoid = new IsoscelesTrapezoid(ColorSupplier.getRandomColor());
        rectangle = new Rectangle(ColorSupplier.getRandomColor());
        rightTriangle = new RightTriangle(ColorSupplier.getRandomColor());
    }

    public String getRandomFigure() {
        int randomNumber = random.nextInt(5);

        switch (randomNumber) {
            case 0:
                return square.draw() + ", color: " + square.getColor();
            case 1:
                return rightTriangle.draw() + ", color: " + rightTriangle.getColor();
            case 2:
                return rectangle.draw() + ", color: " + rectangle.getColor();
            case 3:
                return isoscelesTrapezoid.draw() + ", color: " + isoscelesTrapezoid.getColor();
            default:
                return circle.draw() + ", color: " + circle.getColor();
        }

    }

    public String getDefaultFigure() {
        return defaultFigure.draw() + ", color: " + defaultFigure.getColor();
    }

}
