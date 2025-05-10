package mate;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        String defaultColor = Color.WHITE.toString();
        int defaultRadius = 10;
        return new Circle(defaultColor, defaultRadius);
    }

    private Figure getRandomSquare() {
        String randomColor = colorSupplier.getRandomColor();
        int randomsideA = random.nextInt(10);
        return new Square(randomColor, randomsideA);
    }

    private Figure getRandomRectangle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomsideA = random.nextInt(10);
        int randomsideB = random.nextInt(10);
        return new Rectangle(randomColor, randomsideA, randomsideB);
    }

    private Figure getRandomCircle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomRadius = random.nextInt(10);
        return new Circle(randomColor, randomRadius);
    }

    private Figure getRandomRightTriangle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomfirstLeg = random.nextInt(10);
        int randomsecondLeg = random.nextInt(10);
        return new RightTriangle(randomColor, randomfirstLeg, randomsecondLeg);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String randomColor = colorSupplier.getRandomColor();
        int randomsideA = random.nextInt(10);
        int randomsideB = random.nextInt(10);
        int randomHeight = random.nextInt(10);
        return new IsoscelesTrapezoid(randomColor, randomsideA, randomsideB, randomHeight);
    }

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(6);
        switch (randomNumber) {
            case (1):
                return getRandomSquare();
            case (2):
                return getRandomRectangle();
            case (3):
                return getRandomCircle();
            case (4):
                return getRandomRightTriangle();
            case (5):
                return getRandomIsoscelesTrapezoid();
            default: break;
        }
        return getRandomFigure();
    }
}
