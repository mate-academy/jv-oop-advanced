package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public FigureClass getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        double r1 = random.nextInt() + 1;
        double r2 = random.nextInt() + 1;
        double r3 = random.nextInt() + 1;
        Figure figure = Figure.values()[random.nextInt(Figure.values().length)];
        if (figure == Figure.SQUARE) {
            return new Square(color, r1);
        } else if (figure == Figure.RECTANGLE) {
            return new Rectangle(color, r1, r2);
        } else if (figure == Figure.RIGHTTRIANGLE) {
            return new RightTriangle(color, r1, r2);
        } else if (figure == Figure.ISOSCELESTRAPEZOID) {
            return new IsoscelesTrapezoid(color, r1, r2, r3);
        }
        return new Circle(color, r1);
    }

    public FigureClass getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
