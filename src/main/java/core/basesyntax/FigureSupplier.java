package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "white";
    private static final int RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorsupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FigureList.values().length);
        String randomColor = colorsupplier.getRandomColor();

        switch (FigureList.values()[randomFigure]) {
            case SQUARE:
                return new Square(randomColor, random.nextInt(6) + 1);
            case CIRCLE:
                return new Circle(randomColor,
                        random.nextInt(8) + 1);
            case ISOSCELESTRAPEZOID:
                return new IsoscelesTrapezoid(randomColor,
                        random.nextInt(10 + 1),
                        random.nextInt(10 + 1),
                        random.nextInt(5) + 1);
            case RECTANGLE:
                return new Rectangle(randomColor,
                        random.nextInt(10) + 1,
                        random.nextInt(2) + 1);
            case RIGHTTRIANGLE:
                return new RightTriangle(randomColor,
                        random.nextInt(10) + 1,
                        random.nextInt(5) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, RADIUS);
    }

    public void draw() {
        System.out.println("\nFigure: Circle, "
                + " units, side: "
                + RADIUS
                + " units,"
                + " color: "
                + DEFAULT_COLOR);
    }
}
