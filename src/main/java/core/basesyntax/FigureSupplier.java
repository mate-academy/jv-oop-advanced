package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static Random random = new Random();

    public static Figure getRandomFigure() {
        int type = random.nextInt(5);
        String color = ColorSupplier.getRandomColor();
        double parameter1 = random.nextDouble() * 10 + 1;
        double parameter2 = random.nextDouble() * 10 + 1;
        switch (type) {
            case 0:
                return new Square(color, parameter1);
            case 1:
                return new Rectangle(color, parameter1, parameter2);
            case 2:
                return new RightTriangle(color, parameter1, parameter2);
            case 3:
                return (Figure) new Circle(color, parameter1);
            case 4:
                return new IsoscelesTrapezoid(color, parameter1, parameter2,
                        parameter2 + random.nextDouble() * 10 + 1);
            default:
                throw new RuntimeException("Unknown figure type");
        }
    }

    public static Figure getDefaultFigure() {
        return (Figure) new Circle("white", 10);
    }
}
