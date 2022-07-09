package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    final Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int FIGURE_NUMBER = 5;
        int index = random.nextInt(FIGURE_NUMBER);

        switch (index) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), getRandomProperty());
            case 2:
                return new Square(colorSupplier.getRandomColor(), getRandomProperty());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomProperty(), getRandomProperty());
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomProperty(), getRandomProperty());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomProperty(), getRandomProperty(), getRandomProperty());
        }
    }

    public Figure getDefaultFigure() {
        int DEFAULT_RADIUS = 10;
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    int getRandomProperty() {
        int MAX_PROPERTY_VALUE = 100;
        return random.nextInt(MAX_PROPERTY_VALUE);
    }
}
