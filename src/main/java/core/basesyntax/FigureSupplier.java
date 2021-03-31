package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int COUNT = 5;
    public static final int VALUE_COUNT = 10;

    public Figure createRandomFigure() {
        Random random = new Random();

        int valueFigure = random.nextInt(COUNT);
        switch (valueFigure) {
            case 0 :
                return new Square(random.nextInt(COUNT), ColorSupplier.colorsFigure(), "Square");
            case 1:
                return new Circle(random.nextInt(COUNT), "Circle", ColorSupplier.colorsFigure());
            case 2:
                return new Rectangle(random.nextInt(COUNT), random.nextInt(COUNT),
                        "Recatangle", ColorSupplier.colorsFigure());
            case 3:
                return new RightTriangle(random.nextInt(COUNT), random.nextInt(COUNT),
                        "Right Triangle", ColorSupplier.colorsFigure());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(COUNT), random.nextInt(COUNT),
                        random.nextInt(COUNT), "Isosceles Trapezoid", ColorSupplier.colorsFigure());
            default:
                return new Square(random.nextInt(COUNT), ColorSupplier.colorsFigure(), "Square");
        }

    }
}
