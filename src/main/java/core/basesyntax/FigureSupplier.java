package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int INDEX_RANDOM = 20;
    public static final int FIGURES_LENGTH = 10;

    public Figure getDefaultFigure() {
        Figure circle = new Circle(FIGURES_LENGTH, "WHITE");
        return circle;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int randomNumber = random.nextInt(5);
        switch (randomNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return null;
        }
    }

    public Figure getRandomCircle() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        float radius = INDEX_RANDOM * random.nextFloat();
        return new Circle(radius, color);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        float innerSide = INDEX_RANDOM * random.nextFloat();
        float downSide = INDEX_RANDOM * random.nextFloat();
        float heightTrapezoid = INDEX_RANDOM * random.nextFloat();
        return new IsoscelesTrapezoid(innerSide, downSide, heightTrapezoid, color);
    }

    public Figure getRandomRectangle() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        float firstLeg = INDEX_RANDOM * random.nextFloat();
        float secondLeg = INDEX_RANDOM * random.nextFloat();
        return new Rectangle(firstLeg, secondLeg, color);
    }

    public Figure getRandomRightTriangle() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        float firstLeg = INDEX_RANDOM * random.nextFloat();
        float secondLeg = INDEX_RANDOM * random.nextFloat();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    public Figure getRandomSquare() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        float side = INDEX_RANDOM * random.nextFloat();
        return new Square(side, color);
    }

}
