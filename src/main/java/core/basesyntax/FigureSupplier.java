package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES = 5;
    private static final int DEFAULT_NUMBER = 10;
    private static final int MAX_NUMBER = 10;
    private static final String DEFAULT_COLOR = "White";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(MAX_FIGURES);
        String color = colorSupplier.getRandomColor();

        return switch (index) {
            case 0 -> new Circle(color, random.nextInt(MAX_NUMBER));
            case 1 -> new IsoscelesTrapezoid(color,random.nextInt(MAX_NUMBER),
                    random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER));
            case 2 -> new Rectangle(color, random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER));
            case 3 -> new RightTriangle(color, random.nextInt(MAX_NUMBER),
                    random.nextInt(MAX_NUMBER));
            case 4 -> new Square(color, random.nextInt(MAX_NUMBER));
            default -> new Circle(DEFAULT_COLOR, DEFAULT_NUMBER);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_NUMBER);
    }

}
