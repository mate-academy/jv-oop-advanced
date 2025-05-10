package randomizers;

import core.figures.Circle;
import core.figures.Figure;
import core.figures.IsoscelesTrapezoid;
import core.figures.Rectangle;
import core.figures.RightTriangle;
import core.figures.Square;
import java.util.Random;
import randomizers.sourcerand.Color;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.toString();
    private static final int MAX_INDEX = 4;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_NUMBER = 15;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(MAX_INDEX);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        String randomColor = new ColorSupplier().getRandomColor();
        int randomRadius = random.nextInt(MAX_NUMBER);
        return new Circle(randomColor, randomRadius);
    }

    private Figure getRandomSquare() {
        String randomColor = new ColorSupplier().getRandomColor();
        int randomSide = random.nextInt(MAX_NUMBER);
        return new Square(randomColor, randomSide);
    }

    private Figure getRandomRectangle() {
        String randomColor = new ColorSupplier().getRandomColor();
        int randomSideA = random.nextInt(MAX_NUMBER);
        int randomSideB = random.nextInt(MAX_NUMBER);
        return new Rectangle(randomColor, randomSideA, randomSideB);
    }

    private Figure getRandomRightTriangle() {
        String randomColor = new ColorSupplier().getRandomColor();
        int randomSideA = random.nextInt(MAX_NUMBER);
        int randomSideB = random.nextInt(MAX_NUMBER);
        return new RightTriangle(randomColor, randomSideA, randomSideB);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String randomColor = new ColorSupplier().getRandomColor();
        int randomBaseA = random.nextInt(MAX_NUMBER);
        int randomBaseB = random.nextInt(MAX_NUMBER);
        int randomHeight = random.nextInt(MAX_NUMBER);
        return new IsoscelesTrapezoid(randomColor, randomBaseA, randomBaseB, randomHeight);
    }
}
