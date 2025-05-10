package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUM_FOR_FIGURES = 5;
    private static final int MAX_LENGTH = 25;

    public Figure getFigure() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        int numberOfFigures = random.nextInt(MAX_NUM_FOR_FIGURES);
        switch (numberOfFigures) {
            case 1:
                return new Circle(supplier.getColor(), "circle", random.nextInt(MAX_LENGTH) + 1);
            case 2:
                return new Square(supplier.getColor(), "square", random.nextInt(MAX_LENGTH) + 1);
            case 3:
                return new Rectangle(supplier.getColor(), "rectangle",
                        random.nextInt(MAX_LENGTH) + 1,
                        random.nextInt(MAX_LENGTH) + 1);
            case 4:
                return new RightTriangle(supplier.getColor(), "right triangle",
                                         random.nextInt(MAX_LENGTH) + 1);
            default:
                return new IsoscelesTrapezoid(supplier.getColor(), "isosceles trapezoid",
                        random.nextInt(MAX_LENGTH) + 1, random.nextInt(MAX_LENGTH) + 1,
                        random.nextInt(MAX_LENGTH) + 1);
        }
    }

}
