package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE = 5;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(Figure.MAX_VALUE_SIDE);
        switch (randomNumber) {
            case 0:
                return new Square(color, getLeg());
            case 1:
                return new Rectangle(color, getLeg(), getLeg());
            case 2:
                return new RightTriangle(color, getLeg(), getLeg());
            case 3:
                return new IsoscelesTrapezoid(color, getLeg(), getLeg(), getLeg());
            default:
                return new Circle(color, getLeg());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
    
    public double getLeg() {
        return random.nextInt(Figure.MAX_VALUE_SIDE);
    }
}
