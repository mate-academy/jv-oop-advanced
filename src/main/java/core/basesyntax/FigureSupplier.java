package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String[] FIGURES =
            {"Circle", "Rectangle", "Square", "Isosceles Trapezoid", "Right Triangle"};
    private static final int MAX_PROPERTY_VALUE = 40;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String typeOfFigure = FIGURES[random.nextInt(FIGURES.length)];
        Color randomColor = colorSupplier.getRandomColor();
        switch (typeOfFigure) {
            case "Circle": return getRandomCircle(randomColor);
            case "Rectangle": return getRandomRectangle(randomColor);
            case "Square": return getRandomSquare(randomColor);
            case "Isosceles Trapezoid": return getRandomIsoscelesTrapezoid(randomColor);
            case "Right Triangle": return getRandomRightTriangle(randomColor);
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    private Figure getRandomCircle(Color randomColor) {
        int randomPropertyValue = random.nextInt(MAX_PROPERTY_VALUE);
        return new Circle(randomColor, randomPropertyValue);
    }

    private Figure getRandomRectangle(Color randomColor) {
        int firstRandomPropertyValue = random.nextInt(MAX_PROPERTY_VALUE);
        int secondRandomPropertyValue = random.nextInt(MAX_PROPERTY_VALUE);
        return new Rectangle(randomColor, firstRandomPropertyValue, secondRandomPropertyValue);
    }

    private Figure getRandomSquare(Color randomColor) {
        int randomPropertyValue = random.nextInt(MAX_PROPERTY_VALUE);
        return new Square(randomColor, randomPropertyValue);
    }

    private Figure getRandomRightTriangle(Color randomColor) {
        int firstRandomPropertyValue = random.nextInt(MAX_PROPERTY_VALUE);
        int secondRandomPropertyValue = random.nextInt(MAX_PROPERTY_VALUE);
        return new RightTriangle(randomColor, firstRandomPropertyValue, secondRandomPropertyValue);
    }

    private Figure getRandomIsoscelesTrapezoid(Color randomColor) {
        int firstRandomPropertyValue = random.nextInt(MAX_PROPERTY_VALUE);
        int secondRandomPropertyValue = random.nextInt(MAX_PROPERTY_VALUE);
        int thirdRandomPropertyValue = random.nextInt(MAX_PROPERTY_VALUE);
        return new IsoscelesTrapezoid(randomColor, firstRandomPropertyValue,
                                                   secondRandomPropertyValue,
                                                   thirdRandomPropertyValue);
    }
}
