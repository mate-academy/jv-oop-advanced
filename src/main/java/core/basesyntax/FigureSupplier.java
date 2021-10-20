package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 20;

    public Figure getRandomFigure() {
        Random random = new Random();
        Names[] names = Names.values();
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        Figure figure = null;
        int index = random.nextInt(names.length);
        switch (names[index]) {
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(randomColor, Names.RIGHT_TRIANGLE.toString(),
                        random.nextInt(MAX) + 1, random.nextInt(MAX) + 1);
                break;
            case RECTANGLE:
                figure = new Rectangle(randomColor, Names.RECTANGLE.toString(),
                        random.nextInt(MAX) + 1, random.nextInt(MAX) + 1);
                break;
            case SQUARE:
                figure = new Square(randomColor, Names.SQUARE.toString(), random.nextInt(MAX) + 1);
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(randomColor, Names.ISOSCELES_TRAPEZOID.toString(),
                        random.nextInt(MAX) + 1, random.nextInt(MAX) + 1, random.nextInt(MAX) + 1);
                break;
            case CIRCLE:
                figure = new Circle(randomColor, Names.CIRCLE.toString(), random.nextInt(MAX) + 1);
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle("white", "circle", 10);
        return figure;
    }
}
