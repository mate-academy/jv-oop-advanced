package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();

    public static Figure getRandomFigure() {
        Figure figure;
        String color = ColorSupplier.getRandomColor();

        switch (RANDOM.nextInt(5)) {
            case 0:
                double side = RANDOM.nextInt(10) + 1;
                figure = new Square(side, color);
                break;
            case 1:
                double length = RANDOM.nextInt(10) + 1;
                double width = RANDOM.nextInt(10) + 1;
                figure = new Rectangle(length, width, color);
                break;
            case 2:
                double firstLeg = RANDOM.nextInt(10) + 1;
                double secondLeg = RANDOM.nextInt(10) + 1;
                figure = new RightTriangle(firstLeg, secondLeg, color);
                break;
            case 3:
                double radius = RANDOM.nextInt(10) + 1;
                figure = new Circle(color, radius);
                break;
            case 4:
                double base1 = RANDOM.nextInt(10) + 1;
                double base2 = RANDOM.nextInt(10) + 1;
                double height = RANDOM.nextInt(10) + 1;
                figure = new IsoscelesTrapezoid(base1, base2, height, color);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + RANDOM.nextInt(5));
        }

        return figure;
    }

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
