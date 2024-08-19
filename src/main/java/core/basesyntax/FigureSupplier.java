package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int figuresCount = 5;

    public Figure getRandomFigure() {
        int figureNumber = this.random.nextInt(this.figuresCount);
        String color = this.colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                return new Square(color, this.random.nextDouble());
            case 1:
                return new Rectangle(color, this.random.nextDouble(), this.random.nextDouble());
            case 2:
                return new RightTriangle(color, this.random.nextDouble(), this.random.nextDouble());
            case 3:
                return new Circle(color, this.random.nextDouble());
            case 4:
                return new IsoscelesTrapezoid(
                        color, this.random.nextDouble(),
                        this.random.nextDouble(),
                        this.random.nextDouble()
                );
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10.0);
    }
}
