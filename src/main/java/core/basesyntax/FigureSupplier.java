package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 20;
    private static final int MIN_SIZE = 5;
    private static final int DEFAULT_SIZE = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.getColor();
    private final Random random = new Random();

    public Figure getRandomFigureName() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = random.nextInt(Forms.values().length);
        switch (Forms.values()[index].getForm()) {
            case "CIRCLE":
                return makeCircle(random.nextInt(MAX_SIZE) + MIN_SIZE,
                        colorSupplier.getRandomColor());
            case "RECTANGLE":
                int widht = random.nextInt(MAX_SIZE) + MIN_SIZE;
                int height = random.nextInt(MAX_SIZE) + MIN_SIZE;
                Figure rectangle = new Rectangle(widht, height);
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.getArea();
                rectangle.draw();
                return rectangle;
            case "SQUARE":
                int side = random.nextInt(MAX_SIZE) + MIN_SIZE;
                Figure square = new Square(side);
                square.setColor(colorSupplier.getRandomColor());
                square.getArea();
                square.draw();
                return square;
            case "TRIANGLE":
                int firstLeg = random.nextInt(MAX_SIZE) + MIN_SIZE;
                int secondLeg = random.nextInt(MAX_SIZE) + MIN_SIZE;
                Figure rightTriangle = new RightTriangle(firstLeg, secondLeg);
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.getArea();
                rightTriangle.draw();
                return rightTriangle;
            case "TRAPEZOID":
                int basisDown = random.nextInt(MAX_SIZE) + MIN_SIZE;
                int basisUp = random.nextInt(basisDown - 1) + basisDown - 2;
                int height1 = random.nextInt(MAX_SIZE) + MIN_SIZE;
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(basisDown, basisUp, height1);
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.getArea();
                isoscelesTrapezoid.draw();
                return isoscelesTrapezoid;
            default:
                System.out.println("Figure not found");
        }
        return null;
    }

    protected Figure getDefaultFigure() {
        return makeCircle(DEFAULT_SIZE,DEFAULT_COLOR);
    }

    private Figure makeCircle(int radius, String color) {
        Figure circle = new Circle(radius);
        circle.setColor(color);
        circle.getArea();
        circle.draw();
        return circle;
    }
}
