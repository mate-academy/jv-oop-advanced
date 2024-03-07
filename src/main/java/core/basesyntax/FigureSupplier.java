package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Square(color, random.nextDouble() * 10 + 1);
            case 1 -> new Rectangle(color, random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1);
            case 2 -> new RightTriangle(color,random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1);
            case 3 -> new Circle(color, random.nextDouble() * 10 + 1);
            default ->
                    new IsoscelesTrapezoid(color,random.nextDouble() * 10 + 1,
                            random.nextDouble() * 10 + 1,
                            random.nextDouble() * 10 + 1);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white",10);
    }
}
