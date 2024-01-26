package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_TYPES = 5;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    private double getRandomSide() {
        return random.nextDouble() * 100 + 1;
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(MAX_FIGURE_TYPES);
        switch (figureType) {
            case 0:
                return new Square(color, getRandomSide());
            case 1:
                return new Rectangle(color, getRandomSide(), getRandomSide());
            case 2:
                return new RightTriangle(color, getRandomSide(), getRandomSide());
            case 3:
                return new Circle(color, getRandomSide());
            case 4:
            default:
                return new IsoscelesTrapezoid(color, getRandomSide(),
                        getRandomSide(), getRandomSide());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
