package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_AMOUNT = 5;
    public static final double MAX_FIGURE_SIDE_VALUE = 100;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private double randomDouble = random.nextDouble(MAX_FIGURE_SIDE_VALUE);
    private String randomColor = colorSupplier.getRandomColor().toString().toLowerCase();

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.toString().toLowerCase());
    }

    public Figure getRandomFigure() {
        return switch (random.nextInt(FIGURES_AMOUNT)) {
            case 0 -> new Square(randomDouble,
                    randomColor);
            case 1 -> new RightTriangle(randomDouble, randomDouble, randomColor);
            case 2 -> new IsoscelesTrapezoid(randomDouble, randomDouble, randomDouble,
                    randomColor);
            case 3 -> new Circle(randomDouble, randomColor);
            default -> new Rectangle(randomDouble, randomDouble, randomColor);
        };

    }
}
