package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        RandomParameterSupplier random = new RandomParameterSupplier();
        int index = new Random().nextInt(FigureName.values().length);
        switch (FigureName.values()[index]) {
            case CIRCLE:
                Circle circle = new Circle(random.getRandomNumber());
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case SQUARE:
                Square square = new Square(random.getRandomNumber());
                square.setColor(colorSupplier.getRandomColor());
                return square;
            case RECTANGLE:
                Rectangle rectangle = new Rectangle(random.getRandomNumber(),
                        random.getRandomNumber());
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case RIGHT_TRIANGLE:
                RightTriangle rightTriangle = new RightTriangle(random.getRandomNumber());
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            default:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
                        random.getRandomNumber(),
                        random.getRandomNumber(),
                        random.getRandomNumber());
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor(Color.WHITE);
        return circle;
    }
}
