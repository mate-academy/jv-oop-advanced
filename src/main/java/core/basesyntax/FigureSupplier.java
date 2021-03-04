package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String[] figureList =
            new String[]{"Circle", "Rectangle", "Square", "RightTriangle", "IsoscelesTrapezoid"};
    private static final Random random = new Random();
    private static final int LIMIT = 10;

    public static Behaviour getFigureProperty() {
        String figure = figureList[random.nextInt(figureList.length)];

        switch (figure) {
            case "Circle":
                return new Circle(random.nextInt(LIMIT));
            case "Rectangle":
                return new Rectangle(random.nextInt(LIMIT), random.nextInt(LIMIT));
            case "Square":
                return new Square(random.nextInt(LIMIT));
            case "RightTriangle":
                return new RightTriangle(random.nextInt(LIMIT), random.nextInt(LIMIT));
            default:
                return new IsoscelesTrapezoid(
                        random.nextInt(LIMIT),
                        random.nextInt(LIMIT),
                        random.nextInt(LIMIT)
                );
        }
    }
}
