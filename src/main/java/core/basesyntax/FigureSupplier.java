package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int maxSize = 20;
    private static final int minSize = 5;
    private static final int defaultSize = 10;
    private static final String defaultColor = "WHITE";
    private final Random random = new Random();

    public Figure getRandomFigureName() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = random.nextInt(Forms.values().length);
        switch (Forms.values()[index].getForm()) {
            case "CIRCLE":
                int radius = random.nextInt(maxSize) + minSize;
                Figure circle = new Circle(radius);
                circle.setColor(colorSupplier.getRandomColor());
                circle.getArea();
                circle.draw();
                return circle;
            case "RECTANGLE":
                int widht = random.nextInt(maxSize) + minSize;
                int height = random.nextInt(maxSize) + minSize;
                Figure rectangle = new Rectangle(widht, height);
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.getArea();
                rectangle.draw();
                return rectangle;
            case "SQUARE":
                int side = random.nextInt(maxSize) + minSize;
                Figure square = new Square(side);
                square.setColor(colorSupplier.getRandomColor());
                square.getArea();
                square.draw();
                return square;
            case "TRIANGLE":
                int firstLeg = random.nextInt(maxSize) + minSize;
                int secondLeg = random.nextInt(maxSize) + minSize;
                Figure rightTriangle = new RightTriangle(firstLeg, secondLeg);
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.getArea();
                rightTriangle.draw();
                return rightTriangle;
            case "TRAPEZOID":
                int basisDown = random.nextInt(maxSize) + minSize;
                int basisUp = random.nextInt(basisDown - 1) + basisDown - 2;
                int height1 = random.nextInt(maxSize) + minSize;
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
        Figure circle = new Circle(defaultSize);
        circle.setColor(defaultColor);
        circle.getArea();
        circle.draw();
        return circle;
    }
}
