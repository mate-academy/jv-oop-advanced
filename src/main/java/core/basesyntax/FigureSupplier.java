package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    public static final int MAX_VALUE_OF_PARAMETER = 25;
    public static final int DEFAULT_RADIUS = 10;
    public Figure getRamdomFigure() {
        Random random = new Random();
        int index = random.nextInt(5);
        switch (index) {
            case (0):
                int randomRadius = random.nextInt(MAX_VALUE_OF_PARAMETER);
                String randomColor = colorSupplier.getRandomColor();
                Circle circle = new Circle(randomColor, randomRadius);
                return circle;
            case (1):
                int randomSide = random.nextInt(MAX_VALUE_OF_PARAMETER);
                String randomColor1 = colorSupplier.getRandomColor();
                Square square = new Square(randomColor1, randomSide);
                return square;
            case (2):
                int randomWight = random.nextInt(MAX_VALUE_OF_PARAMETER);
                int randomHeight = random.nextInt(MAX_VALUE_OF_PARAMETER);
                String randomColor2 = colorSupplier.getRandomColor();
                Rectangle rectangle = new Rectangle(randomColor2, randomWight, randomHeight);
                return rectangle;
            case (3):
                int randomBase = random.nextInt(MAX_VALUE_OF_PARAMETER);
                int randomHeight1 = random.nextInt(MAX_VALUE_OF_PARAMETER);
                String randomColor3 = colorSupplier.getRandomColor();
                RightTriangle rightTriangle = new RightTriangle(randomColor3, randomBase, randomHeight1);
                return rightTriangle;
            case (4):
                int randomBase1 = random.nextInt(MAX_VALUE_OF_PARAMETER);
                int randomBase2 = random.nextInt(MAX_VALUE_OF_PARAMETER);
                int randomHeight2 = random.nextInt(MAX_VALUE_OF_PARAMETER);
                String randomColor4 = colorSupplier.getRandomColor();
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(randomColor4, randomBase1, randomBase2, randomHeight2);
                return isoscelesTrapezoid;
        }
        return null;
    }
    public Figure getDefaultFigure() {
        Circle circle = new Circle("White", DEFAULT_RADIUS);
        return circle;
    }
}
