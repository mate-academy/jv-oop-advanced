package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random;
    private final ColorSupplier cs;
    private final Figures[] figures;

    public FigureSupplier(Random random, ColorSupplier cs, Figures[] figures) {
        this.random = random;
        this.cs = cs;
        this.figures = figures;
    }

    public Figure getRandomFigure() {
        Colors color = cs.getRandomColor();
        double r1 = random.nextInt() + 1;
        double r2 = random.nextInt() + 1;
        double r3 = random.nextInt() + 1;
        Figures figure = figures[random.nextInt(figures.length)];
        if (figure == Figures.square) {
            return new Square(color, r1);
        } else if (figure == Figures.rectangle) {
            return new Rectangle(color, r1, r2);
        } else if (figure == Figures.righttriangle) {
            return new RightTriangle(color, r1, r2);
        } else if (figure == Figures.isoscelestrapezoid) {
            return new IsoscelesTrapezoid(color, r1, r2, r3);
        }
        return new Circle(color, r1);
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.white, 10);
    }
}
