package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final SideSupplier sideSupplier = new SideSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);
        String randomColor = colorSupplier.getRandomColor();
        int randomSide = sideSupplier.getRandomSide();

        return switch (figureType) {
            case 0 -> new Square(randomColor, randomSide);
            case 1 -> new Rectangle(randomColor, randomSide,
                    randomSide);
            case 2 -> new RightTriangle(randomColor,
                    randomSide, randomSide);
            case 3 -> new Circle(randomColor, randomSide);
            case 4 -> new IsoscelesTrapezoid(randomColor, randomSide,
                    randomSide, randomSide);
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(String.valueOf(Color.WHITE), DEFAULT_RADIUS);
    }
}
