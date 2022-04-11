package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = Main.getRandom().nextInt(4);
        switch (index) {
            case 0: {
                Figure square = new Square(ColorSupplier.getRandomColor(),
                                                random.nextInt(10));
                return square;
            }
            case 1: {
                Figure rectangle = new Rectangle(ColorSupplier.getRandomColor(),
                                                random.nextInt(10),
                                                random.nextInt(10));
                return rectangle;
            }
            case 2: {
                Figure rightTriangle = new RightTriangle(ColorSupplier.getRandomColor(),
                                                random.nextInt(10),
                                                random.nextInt(10));
                return rightTriangle;
            }
            case 3: {
                Figure circle = new Circle(ColorSupplier.getRandomColor(),
                                                random.nextInt(10));
                return circle;
            }
            case 4: {
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                                                random.nextInt(10),
                                                random.nextInt(10),
                                                random.nextInt(10));
                return isoscelesTrapezoid;
            }
            default: {
                Figure circle = new Circle(Color.WHITE, 10);
                return circle;
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
