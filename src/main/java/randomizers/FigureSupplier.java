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
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int BOUND = 15;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int i = random.nextInt(4);
        switch (i) {
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
        Color randomColor = new ColorSupplier().getRandomColor();
        int randomRadius = random.nextInt(BOUND);
        return new Circle(randomColor, randomRadius);
    }

    private Figure getRandomSquare() {
        Color randomColor = new ColorSupplier().getRandomColor();
        int randomSide = random.nextInt(BOUND);
        return new Square(randomColor, randomSide);
    }

    private Figure getRandomRectangle() {
        Color randomColor = new ColorSupplier().getRandomColor();
        int randomSideA = random.nextInt(BOUND);
        int randomSideB = random.nextInt(BOUND);
        return new Rectangle(randomColor, randomSideA, randomSideB);
    }

    private Figure getRandomRightTriangle() {
        Color randomColor = new ColorSupplier().getRandomColor();
        int randomSideA = random.nextInt(BOUND);
        int randomSideB = random.nextInt(BOUND);
        return new RightTriangle(randomColor, randomSideA, randomSideB);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        Color randomColor = new ColorSupplier().getRandomColor();
        int randomBaseA = random.nextInt(BOUND);
        int randomBaseB = random.nextInt(BOUND);
        int randomHeight = random.nextInt(BOUND);
        return new IsoscelesTrapezoid(randomColor, randomBaseA, randomBaseB, randomHeight);
    }
}
