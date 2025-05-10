package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_SIZE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private Figure createSquare() {
        int side = random.nextInt(MAX_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        Figure square = new Square(color,side);
        return square;
    }

    private Figure createRectangle() {
        int firstSide = random.nextInt(MAX_SIZE) + 1;
        int secondSide = random.nextInt(MAX_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        Figure rectangle = new Rectangle(color, firstSide, secondSide);
        return rectangle;
    }

    private Figure createRightTriangle() {
        int firstLeg = random.nextInt(MAX_SIZE) + 1;
        int secondLeg = random.nextInt(MAX_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        Figure rightTriangle = new RightTriangle(color, firstLeg, secondLeg);;
        return rightTriangle;
    }

    private Figure createCircle() {
        int radius = random.nextInt(MAX_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        Figure circle = new Circle(color,radius);
        return circle;
    }

    private Figure createIsoscelesTrapezoid() {
        int firstBase = random.nextInt(MAX_SIZE) + 1;
        int secondBase = random.nextInt(MAX_SIZE) + 1;
        int height = random.nextInt(MAX_SIZE) + 1;
        String color = colorSupplier.getRandomColor();
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(color, firstBase, secondBase, height);
        return isoscelesTrapezoid;
    }

    public Figure getRandomFigure() {
        Figure figure = getDefaultFigure();
        int index = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case SQUARE:
                figure = createSquare();
                break;
            case RECTANGLE:
                figure = createRectangle();
                break;
            case RIGHT_TRIANGLE:
                figure = createRightTriangle();
                break;
            case CIRCLE:
                figure = createCircle();
                break;
            case ISOSCELES_TRAPEZOID:
                figure = createIsoscelesTrapezoid();
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        String color = Color.WHITE.name();
        Figure figure = new Circle(color,10);
        return figure;
    }
}
