package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final double DEFAULT_RADIUS = 10.0;
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle("white", DEFAULT_RADIUS);
    }
    public Figure getRandomFigure() {
        int figureType = RANDOM.nextInt(5);
        String color = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Circle(color, RANDOM.nextDouble() * 10 + 1);
            case 1 -> new Square(color, RANDOM.nextDouble() * 10 + 1);
            case 2 -> new Rectangle(color, RANDOM.nextDouble() * 10 + 1, RANDOM.nextDouble() * 10 + 1);
            case 3 -> new RightTriangle(color, RANDOM.nextDouble() * 10 + 1, RANDOM.nextDouble() * 10 + 1);
            case 4 ->
                    new IsoscelesTrapezoid(color, RANDOM.nextDouble() * 10 + 1, RANDOM.nextDouble() * 10 + 1, RANDOM.nextDouble() * 10 + 1);
            default -> getDefaultFigure();
        };

    }

    }



