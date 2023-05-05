package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE = 5;
    private static final int MAX_VALUE = 10;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE);

        switch (index) {
            case 0:
                Figure circle = new Circle(supplier.getRandomColor(), random.nextInt(MAX_VALUE));
                System.out.println(circle.draw());
                break;
            case 1:
                Figure rectangle = new Rectangle(supplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
                System.out.println(rectangle.draw());
                break;
            case 2:
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(supplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
                System.out.println(isoscelesTrapezoid.draw());
                break;
            case 3:
                Figure square = new Square(supplier.getRandomColor(), random.nextInt(MAX_VALUE));
                System.out.println(square.draw());
                break;
            default:
                Figure rightTriangle = new RightTriangle(supplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
                System.out.println(rightTriangle.draw());
                break;
        }
        return null;
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(Color.WHITE, MAX_VALUE);
        System.out.println(circle.draw());
        return circle;
    }
}
