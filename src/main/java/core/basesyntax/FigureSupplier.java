package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int figureIndex = random.nextInt(0, 5);

        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(0, 10));
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(0, 10));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(0, 10),
                        random.nextInt(0, 10));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(0, 10),
                        random.nextInt(0, 10));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(0,10),
                        random.nextInt(0, 10));
            default:
                System.out.println(" ");
        }
        return new Circle(Color.BLUE.name(), figureIndex);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);

    }
}
