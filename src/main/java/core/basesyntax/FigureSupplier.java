package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final String DEFAULT_TYPE = FigureType.CIRCLE.name();
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier randomColor = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        FigureType[] names = FigureType.values();
        int index = random.nextInt(names.length);
        return switch (names[index].name()) {
            case "SQUARE" -> new Square(
                    random.nextDouble(),
                    randomColor.getRandomColor(),
                    names[index].name()
            );
            case "RECTANGLE" -> new Rectangle(
                    random.nextDouble(),
                    random.nextDouble(),
                    randomColor.getRandomColor(),
                    names[index].name()
            );
            case "RIGHT_TRIANGLE" -> new RightTriangle(
                    random.nextDouble(),
                    random.nextDouble(),
                    randomColor.getRandomColor(),
                    names[index].name()
            );
            case "CIRCLE" -> new Circle(
                    random.nextDouble(),
                    randomColor.getRandomColor(),
                    names[index].name()
            );
            default -> new IsoscelesTrapezoid(
                    random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble(),
                    randomColor.getRandomColor(),
                    names[index].name()
            );
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR, DEFAULT_TYPE);
    }
}
