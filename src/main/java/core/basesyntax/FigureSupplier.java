package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Colors color = colorSupplier.getRandomColor();
        double r1 = random.nextInt() + 1;
        double r2 = random.nextInt() + 1;
        double r3 = random.nextInt() + 1;
        Figures figure = Figures.values()[random.nextInt(Figures.values().length)];
        if (figure == Figures.SQUARE) {
            return new Square(color, r1);
        } else if (figure == Figures.RECTANGLE) {
            return new Rectangle(color, r1, r2);
        } else if (figure == Figures.RIGHTTRIANGLE) {
            return new RightTriangle(color, r1, r2);
        } else if (figure == Figures.ISOSCELESTRAPEZOID) {
            return new IsoscelesTrapezoid(color, r1, r2, r3);
        }
        return new Circle(color, r1);
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE, 10);
    }
}
