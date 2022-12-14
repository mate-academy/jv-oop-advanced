package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure = generateFigure();
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        final int defaultRadius = 10;
        Figure figure = new Circle(defaultRadius);
        figure.setColor(Color.WHITE);
        return figure;
    }

    private Figure generateFigure() {
        final int quantityOfFigures = 5;
        int figure1 = random.nextInt(quantityOfFigures);
        final int maxSize = 500;
        switch (figure1) {
            case 0:
                return new Square(random.nextInt(maxSize));
            case 1:
                return new Rectangle(random.nextInt(maxSize), random.nextInt(maxSize));
            case 2:
                return new RightTriangle(random.nextInt(maxSize), random.nextInt(maxSize));
            case 3:
                return new Circle(random.nextInt(maxSize));
            case 4:
            default:
                return new IsoscelesTrapezoid(random.nextInt(maxSize), random.nextInt(maxSize),
                        random.nextInt(maxSize));
        }
    }
}
