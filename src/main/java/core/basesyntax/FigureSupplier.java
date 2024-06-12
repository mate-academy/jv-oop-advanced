package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureList.values().length);
        String figureName = FigureList.values()[index].name();

        Color randomColor = Color.valueOf(colorSupplier.getRandomColor());

        Figure randomFigure = null;
        switch (figureName) {
            case "CIRCLE":
                randomFigure = new Circle(randomColor, randomSize());
                break;
            case "ISOSCELES_TRAPEZOID":
                randomFigure = new IsoscelesTrapezoid(randomColor,
                        randomSize(), randomSize(), randomSize());
                break;
            case "RECTANGLE":
                randomFigure = new Rectangle(randomColor, randomSize(), randomSize());
                break;
            case "RIGHT_TRIANGLE":
                randomFigure = new RightTriangle(randomColor, randomSize());
                break;
            case "SQUARE":
                randomFigure = new Square(randomColor, randomSize());
                break;
            default:
                randomFigure = new Square(randomColor, randomSize());
        }
        return randomFigure;
    }

    private double randomSize() {
        return random.nextInt(1, 50);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
