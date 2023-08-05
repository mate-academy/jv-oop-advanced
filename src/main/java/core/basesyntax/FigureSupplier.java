package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier;
    private final Random random = new Random();

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Figure[] figures = {
                new Square(5, colorSupplier.getRandomColor()),
                new Rectangle(4, 6, colorSupplier.getRandomColor()),
                new Circle(3, colorSupplier.getRandomColor()),
                new RightTriangle(3, 4, colorSupplier.getRandomColor()),
                new IsoscelesTrapezoid(5, 7, 4, colorSupplier.getRandomColor())
        };
        return figures[random.nextInt(figures.length)];
    }
}
