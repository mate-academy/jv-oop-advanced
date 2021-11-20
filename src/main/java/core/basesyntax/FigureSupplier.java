package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private TypeSupplier randomType = new TypeSupplier();
    private Random randomLength = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public TypeSupplier getRandomType() {
        return randomType;
    }

    public void setRandomType(TypeSupplier randomType) {
        this.randomType = randomType;
    }

    public Random getRandomLength() {
        return randomLength;
    }

    public void setRandomLength(Random randomLength) {
        this.randomLength = randomLength;
    }

    public void setRandomColor(ColorSupplier randomColor) {
        this.randomColor = randomColor;
    }

    public Figure getRandomFigure() {
        switch (randomType.getRandomType()) {
            case "SQUARE" :
                Square square = new Square();
                square.setSide(randomLength.nextInt(10) + 1);
                square.setColor(randomColor.getRandomColor());
                return square;

            case "RECTANGLE" :
                Rectangle rectangle = new Rectangle();
                rectangle.setFirstSide(randomLength.nextInt(10) + 1);
                rectangle.setSecondSide(randomLength.nextInt(10) + 1);
                rectangle.setColor(randomColor.getRandomColor());
                return rectangle;

            case "RIGHT_TRIANGLE" :
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(randomLength.nextInt(10) + 1);
                rightTriangle.setSecondLeg(randomLength.nextInt(10) + 1);
                rightTriangle.setColor(randomColor.getRandomColor());
                return rightTriangle;

            case "CIRCLE" :
                Circle circle = new Circle();
                circle.setRadius(randomLength.nextInt(10) + 1);
                circle.setColor(randomColor.getRandomColor());
                return circle;

            default :
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setShorterSide(randomLength.nextInt(10) + 1);
                isoscelesTrapezoid.setLongerSide(randomLength.nextInt(10) + 1);
                isoscelesTrapezoid.setHeight(randomLength.nextInt(10) + 1);
                isoscelesTrapezoid.setColor(randomColor.getRandomColor());
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("WHITE");
        return circle;
    }
}
