package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = 5;
        int index = random.nextInt(figureNumber);

        switch (index) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), getRandomProperty());
            case 2:
                return new Square(colorSupplier.getRandomColor(), getRandomProperty());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomProperty(),
                        getRandomProperty());
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomProperty(),
                        getRandomProperty());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomProperty(),
                        getRandomProperty(), getRandomProperty());
        }
    }

    public Figure getDefaultFigure() {
        int defaultRadius = 10;
        return new Circle(Color.WHITE.name(), defaultRadius);
    }

    int getRandomProperty() {
        int maxPropertyValue = 100;
        return random.nextInt(maxPropertyValue);
    }
}
