package core.basesyntax.figures;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        String color = new ColorSupplier().getRandomColor();
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(random.nextInt(10) + 1, color);

            case 1:
                return new Rectangle(random.nextInt(10) + 1,
                        random.nextInt(10) + 1, color);
            case 2:
                return new RightTriangle(random.nextInt(10) + 1,
                        random.nextInt(10) + 1, color);
            case 3:
                return new Circle(random.nextInt(10) + 1, color);
            default:
                return new IsoscelesTrapezoid(random.nextInt(10) + 1,
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1, color);

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
