package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MIN = 1e-10;
    private static final double MAX = 100000;
    private Random rand = new Random();

    public Figure randFigureProper() {
        Figure f;
        int num = rand.nextInt(5);
        switch (num) {
            case 0:
                f = new Square(MIN + (MAX - MIN) * rand.nextDouble());
                return f;
            case 1:
                f = new Rectangle(MIN + (MAX - MIN) * rand.nextDouble(),
                        MIN + (MAX - MIN) * rand.nextDouble());
                return f;
            case 2:
                f = checkTriangleSides();
                return f;
            case 3:
                f = new Circle(MIN + (MAX - MIN) * rand.nextDouble());
                return f;
            case 4:
                f = checkTrapezoidSides();
                return f;
            default:
                break;
        }
        return null;
    }

    private Figure checkTriangleSides() {
        double leg1 = MIN + (MAX - MIN) * rand.nextDouble();
        double leg2 = MIN + (MAX - MIN) * rand.nextDouble();
        double hypotenuse = MIN + (MAX - MIN) * rand.nextDouble();
        if (hypotenuse * hypotenuse != leg1 * leg1 + leg2 * leg2) {
            return null;
        }
        return new RigthTriangle(leg1, leg2, hypotenuse);
    }

    private Figure checkTrapezoidSides() {
        double topSide = MIN + (MAX - MIN) * rand.nextDouble();
        double botSide = MIN + (MAX - MIN) * rand.nextDouble();
        double lrSide = MIN + (MAX - MIN) * rand.nextDouble();
        if (topSide < botSide) {
            return null;
        }
        return new IsoscelesTrapezoid(topSide, botSide, lrSide);
    }
}
