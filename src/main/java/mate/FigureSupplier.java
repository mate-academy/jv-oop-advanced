package mate;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        String color = "WHITE";
        int radius = 10;
        return new Circle(color, radius);
    }

    public Figure getRandomFigure() {
        int randomsideA = random.nextInt(1, 10);
        int randomsideB = random.nextInt(1, 10);
        int randomsideC = random.nextInt(1, 10);
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(1, 6);
        switch (randomNumber) {
            case (1):
                return new Square(randomColor, randomsideA);
            case (2):
                return new Rectangle(randomColor, randomsideA, randomsideB);
            case (3):
                return new Circle(randomColor, randomsideA);
            case (4):
                return new RightTriangle(randomColor, randomsideA, randomsideB);
            case (5):
                return new IsoscelesTrapezoid(randomColor, randomsideA, randomsideB, randomsideC);
            default: break;
        }
        return getRandomFigure();
    }
}




