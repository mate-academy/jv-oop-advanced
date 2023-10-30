package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure[] figure = {
            new Rectangle(
                    colorSupplier.getRandomColor(),
                    this.getRandom(MAX_NUMBER),
                    this.getRandom(MAX_NUMBER)
            ),
            new Circle(
                    colorSupplier.getRandomColor(),
                    this.getRandom(MAX_NUMBER)
            ),
            new Square(
                    colorSupplier.getRandomColor(),
                    this.getRandom(MAX_NUMBER)
            ),
            new RightTriangle(
                    colorSupplier.getRandomColor(),
                    this.getRandom(MAX_NUMBER),
                    this.getRandom(MAX_NUMBER)
            ),
            new IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    this.getRandom(MAX_NUMBER),
                    this.getRandom(MAX_NUMBER),
                    this.getRandom(MAX_NUMBER)
            )
    };

    public int getRandom(int maxNumber) {
        return random.nextInt(maxNumber) + 1;
    }

    public Figure getRandomFigure() {
        return this.figure[this.getRandom(4)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
