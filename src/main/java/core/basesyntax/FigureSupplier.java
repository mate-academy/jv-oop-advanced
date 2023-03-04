package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    public static final int MAX_VALUE_OF_PARAMETER = 25;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = "White";

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
                String randomColorSquare = colorSupplier.getRandomColor();
                Square square = new Square(randomColorSquare, randomSide);
                return square;
            case (2):
                int randomWight = random.nextInt(MAX_VALUE_OF_PARAMETER);
                int randomHeight = random.nextInt(MAX_VALUE_OF_PARAMETER);
                String randomColorRectangle = colorSupplier.getRandomColor();
                Rectangle rectangle = new Rectangle(randomColorRectangle, randomWight, randomHeight);
                return rectangle;
            case (3):
                int randomBase = random.nextInt(MAX_VALUE_OF_PARAMETER);
                int randomHeightTriangle = random.nextInt(MAX_VALUE_OF_PARAMETER);
                String randomColorTriangle = colorSupplier.getRandomColor();
                RightTriangle rightTriangle = new RightTriangle(randomColorTriangle, randomBase, randomHeightTriangle);
                return rightTriangle;
            case (4):
                int randomBaseTrapezoid = random.nextInt(MAX_VALUE_OF_PARAMETER);
                int randomBaseIsoscelesTrapezoid = random.nextInt(MAX_VALUE_OF_PARAMETER);
                int randomHeightTrapezoid = random.nextInt(MAX_VALUE_OF_PARAMETER);
                String randomColorTrapezoid = colorSupplier.getRandomColor();
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(randomColorTrapezoid, randomBaseTrapezoid, randomBaseIsoscelesTrapezoid, randomHeightTrapezoid);
                return isoscelesTrapezoid;
        }
        return null;
    }
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
