package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MIN = 1e-10;
    private static final double MAX = 100000;
    private static final int FIGURES_NUMBER = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        int num = random.nextInt(FIGURES_NUMBER);
        switch (num) {
            case 0:
                figure = new Square(MIN + (MAX - MIN) * random.nextDouble(),
                        colorSupplier.generateColor());
                return figure;
            case 1:
                figure = new Rectangle(MIN + (MAX - MIN) * random.nextDouble(),
                        MIN + (MAX - MIN) * random.nextDouble(), colorSupplier.generateColor());
                return figure;
            case 2:
                figure = checkTriangleSides();
                return figure;
            case 3:
                figure = new Circle(MIN + (MAX - MIN) * random.nextDouble(),
                        colorSupplier.generateColor());
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
        double legOne = MIN + (MAX - MIN) * random.nextDouble();
        double legTwo = MIN + (MAX - MIN) * random.nextDouble();
        double hypotenuse = Math.sqrt(legOne * legOne + legTwo * legTwo);

        return new RigthTriangle(legOne, legTwo, hypotenuse, colorSupplier.generateColor());
    }

    private Figure checkTrapezoidSides() {
        double topSide = MIN + (MAX - MIN) * random.nextDouble();
        double botSide = MIN + (MAX - MIN) * random.nextDouble();
        double lrSide = MIN + (MAX - MIN) * random.nextDouble();
        while (topSide < botSide) {
            topSide = MIN + (MAX - MIN) * random.nextDouble();
            botSide = MIN + (MAX - MIN) * random.nextDouble();
        }
        return new IsoscelesTrapezoid(topSide, botSide, lrSide, colorSupplier.generateColor());
    }
}
