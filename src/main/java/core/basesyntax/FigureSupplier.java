package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int figureAmount = 5;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(figureAmount);
        switch (figureNumber) {
            case 1:
                Circle circle = new Circle(colorSupplier.getRandomColor());
                circle.setRadius(getRandomValue());
                return circle;
            case 2:
                Square square = new Square(colorSupplier.getRandomColor());
                square.setSide(getRandomValue());
                return square;
            case 3:
                Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor());
                rectangle.setSides(getRandomValue(), getRandomValue());
                return rectangle;
            case 4:
                RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor());
                rightTriangle.setLegs(getRandomValue(), getRandomValue());
                return rightTriangle;
            default:
                Color color = colorSupplier.getRandomColor();
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(color);
                isoscelesTrapezoid.setSides(getRandomValue(), getRandomValue(), getRandomValue());
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        return circle;
    }

    private double getRandomValue() {
        return random.nextInt(1000) / 100.00;
    }
}
