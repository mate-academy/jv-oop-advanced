package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public final static int MAX_VALUE_OF_PARAMETER = 25;

    public final static int DEFAULT_RADIUS = 10;

    public final static String DEFAULT_COLOR = "White";

    private final Random random = new Random();

    public Figure getRamdomFigure() {
        int index = random.nextInt(5);
        switch (index) {
            case (0):
                int randomRadius = random.nextInt(MAX_VALUE_OF_PARAMETER);
                String randomColor = colorSupplier.getRandomColor();
                return new Circle(randomColor, randomRadius);
            case (1):
                int randomSide = random.nextInt(MAX_VALUE_OF_PARAMETER);
                String randomColorSquare = colorSupplier.getRandomColor();
                return new Square(randomColorSquare, randomSide);
            case (2):
                int randomWight = random.nextInt(MAX_VALUE_OF_PARAMETER);
                int randomHeight = random.nextInt(MAX_VALUE_OF_PARAMETER);
                String randomColorRectangle = colorSupplier.getRandomColor();
                return new Rectangle(randomColorRectangle, randomWight, randomHeight);
            case (3):
                int randomBase = random.nextInt(MAX_VALUE_OF_PARAMETER);
                int randomHeightTriangle = random.nextInt(MAX_VALUE_OF_PARAMETER);
                String randomColorTriangle = colorSupplier.getRandomColor();
                return new RightTriangle(randomColorTriangle, randomBase, randomHeightTriangle);
            case (4):
                int randomBaseTrapezoid = random.nextInt(MAX_VALUE_OF_PARAMETER);
                int randomBaseIsoscelesTrapezoid = random.nextInt(MAX_VALUE_OF_PARAMETER);
                int randomHeightTrapezoid = random.nextInt(MAX_VALUE_OF_PARAMETER);
                String randomColorTrapezoid = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(randomColorTrapezoid,
                        randomBaseTrapezoid, randomBaseIsoscelesTrapezoid, randomHeightTrapezoid);
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
