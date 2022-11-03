package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_SIZE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private Figure figure;

    public Figure getRandomFigure() {
        int index = random.nextInt(MathFigure.values().length);
        String color = colorSupplier.getRandomColor();
        switch (MathFigure.values()[index]) {
            case SQUARE:
                int side = random.nextInt(MAX_SIZE) + 1;
                figure = new Square(color,side);
                break;
            case RECTANGLE:
                int firstSide = random.nextInt(MAX_SIZE) + 1;
                int secondSide = random.nextInt(MAX_SIZE) + 1;
                figure = new Rectangle(color,firstSide,secondSide);
                break;
            case RIGHT_TRIANGLE:
                int firstLeg = random.nextInt(MAX_SIZE) + 1;
                int secondLeg = random.nextInt(MAX_SIZE) + 1;
                figure = new RightTriangle(color,firstLeg,secondLeg);
                break;
            case CIRCLE:
                int radius = random.nextInt(MAX_SIZE) + 1;
                figure = new Circle(color,radius);
                break;
            case ISOSCELES_TRAPEZOID:
                int firstBase = random.nextInt(MAX_SIZE) + 1;
                int secondBase = random.nextInt(MAX_SIZE) + 1;
                int height = random.nextInt(MAX_SIZE) + 1;
                figure = new IsoscelesTrapezoid(color,firstBase,secondBase,height);
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        String color = Color.WHITE.name();
        figure = new Circle(color,10);
        return figure;
    }
}
