package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    public static final int MAX_NUMBER = 50;
    public static final ColorSupplier colorSupplier = new ColorSupplier();
    public static final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(5);
        switch (randomNumber) {
            case 0: 
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        double height = MAX_NUMBER * random.nextDouble();
        double top = MAX_NUMBER * random.nextDouble();
        double bottom = MAX_NUMBER * random.nextDouble();
        return new IsoscelesTrapezoid(color, height, top, bottom);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        double radius = MAX_NUMBER * random.nextDouble();
        return new Circle(color, radius);
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        double firstSide = MAX_NUMBER * random.nextDouble();
        double secondSide = MAX_NUMBER * random.nextDouble();
        return new Rectangle(color, firstSide, secondSide);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        double firstLeg = MAX_NUMBER * random.nextDouble();
        double secondLeg = MAX_NUMBER * random.nextDouble();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        double side = MAX_NUMBER * random.nextDouble();
        return new Square(color, side);
    }
}
