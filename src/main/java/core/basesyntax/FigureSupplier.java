package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 20;
    private static final int MIN_SIZE = 5;
    private static final int DEFAULT_SIZE = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.getColor();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigureName() {
        int index = random.nextInt(Form.values().length);
        switch (Form.values()[index].getForm()) {
            case "CIRCLE":
                return prepareCircle(random.nextInt(MAX_SIZE) + MIN_SIZE,
                        colorSupplier.getRandomColor());
            case "RECTANGLE":
                return prepareRectangle(random.nextInt(MAX_SIZE) + MIN_SIZE,
                        random.nextInt(MAX_SIZE) + MIN_SIZE,
                        colorSupplier.getRandomColor());
            case "SQUARE":
                return prepareSquare(random.nextInt(MAX_SIZE) + MIN_SIZE,
                        colorSupplier.getRandomColor());
            case "TRIANGLE":
                return prepareTriangle(random.nextInt(MAX_SIZE) + MIN_SIZE,
                        random.nextInt(MAX_SIZE) + MIN_SIZE,
                        colorSupplier.getRandomColor());
            case "TRAPEZOID":
                return prepareTrapezoid(random.nextInt(MAX_SIZE) + MIN_SIZE,
                        random.nextInt(MAX_SIZE) + MIN_SIZE,
                        random.nextInt(MAX_SIZE) + MIN_SIZE,
                        colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return prepareCircle(DEFAULT_SIZE,DEFAULT_COLOR);
    }

    private Figure prepareCircle(int radius, String color) {
        Figure circle = new Circle(radius);
        circle.setColor(color);
        circle.getArea();
        circle.draw();
        return circle;
    }

    private Figure prepareRectangle(int widht, int height, String color) {
        Figure rectangle = new Rectangle(widht, height);
        rectangle.setColor(color);
        rectangle.getArea();
        rectangle.draw();
        return rectangle;
    }

    private Figure prepareSquare(int side, String color) {
        Figure square = new Square(side);
        square.setColor(color);
        square.getArea();
        square.draw();
        return square;
    }

    private Figure prepareTriangle(int firstLeg, int secondLeg, String color) {
        Figure rightTriangle = new RightTriangle(firstLeg, secondLeg);
        rightTriangle.setColor(color);
        rightTriangle.getArea();
        rightTriangle.draw();
        return rightTriangle;
    }

    private Figure prepareTrapezoid(int basisDown, int basisUp, int height, String color) {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(basisDown, basisUp, height);
        isoscelesTrapezoid.setColor(color);
        isoscelesTrapezoid.getArea();
        isoscelesTrapezoid.draw();
        return isoscelesTrapezoid;

    }
}
