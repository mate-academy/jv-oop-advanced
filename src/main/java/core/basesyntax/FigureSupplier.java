package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE = 4;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_FIGURE);
        switch (randomNumber) {
            case 0:
                return new Circle(color,"circle", getLeg());
            case 1:
                return new Square(color,"square", getLeg());
            case 2:
                return new Rectangle(color,"rectangle", getLeg(), getLeg());
            case 3:
                return new RightTriangle(color, "right triangle", getLeg(), getLeg());
            default:
                return new IsoscelesTrapezoid(color,"isosceles trapezoid",
                        getLeg(), getLeg(), getLeg());

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, "circle", 10);
    }
    
    public double getLeg() {
        return random.nextInt(Figure.MAX_VALUE_SIDE);
    }
}
