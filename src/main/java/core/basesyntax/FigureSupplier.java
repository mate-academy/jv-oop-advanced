package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER = 100;
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();

        switch (random.nextInt(5)) {
            case 0:
                Figure square = new Square(random.nextInt(1, NUMBER));
                square.setColor(colorSupplier.getRandomColor());
                return square;
            case 1:
                Figure circle = new Circle(random.nextInt(1, NUMBER));
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case 2:
                Figure rectangle = new Rectangle(random.nextInt(1, NUMBER),
                        random.nextInt(1, NUMBER));
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case 3:
                Figure rightTriangle = new RightTriangle(random.nextInt(1, NUMBER),
                        random.nextInt(1, NUMBER));
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            case 4:
                Figure isoscelesTrapezoid
                        = new IsoscelesTrapezoid(random.nextInt(1, NUMBER),
                        random.nextInt(1, NUMBER), random.nextInt(1, NUMBER));
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            default:
                break;
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor("WHITE");
        return circle;
    }
}
