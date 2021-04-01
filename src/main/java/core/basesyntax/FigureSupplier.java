package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MIN = 1e-10;
    private static final double MAX = 100000;
    private final int numberOfFigures = 5;
    private final Random random = new Random();

    public Figure randomFigureProper() {
        Figure figure;
        int num = random.nextInt(numberOfFigures);
        switch (num) {
            case 0:
                figure = new Square(MIN + (MAX - MIN) * random.nextDouble(), Color.BLACK);
                return figure;
            case 1:
                figure = new Rectangle(MIN + (MAX - MIN) * random.nextDouble(),
                        MIN + (MAX - MIN) * random.nextDouble(), Color.BLACK);
                return figure;
            case 2:
                figure = checkTriangleSides();
                return figure;
            case 3:
                figure = new Circle(MIN + (MAX - MIN) * random.nextDouble(), Color.BLACK);
                return figure;
            case 4:
                figure = checkTrapezoidSides();
                return figure;
            default:
                break;
        }
        return null;
    }

    private Figure checkTriangleSides() {
        double leg1 = MIN + (MAX - MIN) * random.nextDouble();
        double leg2 = MIN + (MAX - MIN) * random.nextDouble();
        double hypotenuse = MIN + (MAX - MIN) * random.nextDouble();
        if (hypotenuse * hypotenuse != leg1 * leg1 + leg2 * leg2) {
            return null;
        }
        return new RigthTriangle(leg1, leg2, hypotenuse, Color.BLACK);
    }

    private Figure checkTrapezoidSides() {
        double topSide = MIN + (MAX - MIN) * random.nextDouble();
        double botSide = MIN + (MAX - MIN) * random.nextDouble();
        double lrSide = MIN + (MAX - MIN) * random.nextDouble();
        if (topSide < botSide) {
            return null;
        }
        return new IsoscelesTrapezoid(topSide, botSide, lrSide, Color.BLACK);
    }
}
