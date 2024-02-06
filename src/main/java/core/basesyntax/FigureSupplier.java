package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_ISOSCELES_TRAPEZOID_SIDE_A = 20;
    private static final int MAX_ISOSCELES_TRAPEZOID_SIDE_B = 10;
    private static final int MAX_ISOSCELES_TRAPEZOID_WEIGHT = 15;
    private static final int MAX_RECTANGLE_WIDTH = 10;
    private static final int MAX_RECTANGLE_HEIGHT = 10;
    private static final int MAX_SQUARE_SIDE = 20;
    private static final int MAX_RIGHT_TRIANGLE_FIRST_LEG = 20;
    private static final int MAX_RIGHT_TRIANGLE_SECOND_LEG = 20;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                return getRandomCircle();
            case ISOSCELESTRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHTTRIANGLE:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(),DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(MAX_SQUARE_SIDE);
        Figure randomFigure = new Circle(color, radius);
        return randomFigure;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int sideA = random.nextInt(MAX_ISOSCELES_TRAPEZOID_SIDE_A);
        int sideB = random.nextInt(MAX_ISOSCELES_TRAPEZOID_SIDE_B);
        int weight = random.nextInt(MAX_ISOSCELES_TRAPEZOID_WEIGHT);
        Figure randomFigure = new IsoscelesTrapezoid(color, sideA, sideB, weight);
        return randomFigure;
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int width = random.nextInt(MAX_RECTANGLE_WIDTH);
        int height = random.nextInt(MAX_RECTANGLE_HEIGHT);
        Figure randomFigure = new Rectangle(color, width, height);
        return randomFigure;
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(MAX_RIGHT_TRIANGLE_FIRST_LEG);
        int secondLeg = random.nextInt(MAX_RIGHT_TRIANGLE_SECOND_LEG);
        Figure randomFigure = new RightTriangle(color, firstLeg, secondLeg);
        return randomFigure;
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_SQUARE_SIDE);
        Figure randomFigure = new Square(color, side);
        return randomFigure;
    }
}
