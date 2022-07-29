package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        RandomParameterSupplier random = new RandomParameterSupplier();
        int index = new Random().nextInt(Figures.values().length);
        switch (Figures.values()[index]) {
            case CIRCLE:
                Circle circle = new Circle(random.getRandom());
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case SQUARE:
                Square square = new Square(random.getRandom());
                square.setColor(colorSupplier.getRandomColor());
                return square;
            case RECTANGLE:
                Rectangle rectangle = new Rectangle(random.getRandom(), random.getRandom());
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case RIGHT_TRIANGLE:
                RightTriangle rightTriangle = new RightTriangle(random.getRandom());
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            default:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(random.getRandom(),
                        random.getRandom(), random.getRandom());
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(Color.WHITE);
        return circle;
    }
}
