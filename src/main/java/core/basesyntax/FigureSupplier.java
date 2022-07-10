package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_CIRCLE_RADIUS = 10;
    public static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;
    public static final int MAX_NAMBER = 25;
    public static final int COUNT_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figures getRandomFigure() {
        int countFigure = random.nextInt(COUNT_OF_FIGURES);
        switch (countFigure) {
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NAMBER));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NAMBER),
                        random.nextInt(MAX_NAMBER));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NAMBER),
                        random.nextInt(MAX_NAMBER));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NAMBER),
                        random.nextInt(MAX_NAMBER),
                        random.nextInt(MAX_NAMBER));
            default:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_NAMBER));
        }
    }

    public static Figures getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR.toString(), DEFAULT_CIRCLE_RADIUS);
    }
}
