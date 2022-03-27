package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int UPPER_BOUND = 1000;
    private static final int R_DEFAULT = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        String[] figure = new String[]{"square", "rectangle", "circle",
                "right triangle", "isosceles trapezoid"};
        int n = (int) Math.floor(Math.random() * figure.length);
        ColorSupplier colorSupplier = new ColorSupplier();
        String figureColor = colorSupplier.getRandomColor();
        switch (figure[n]) {
            case ("square"):
                int side = random.nextInt(UPPER_BOUND);
                return new Square(figureColor, side);
            case ("rectangle"):
                int side1 = random.nextInt(UPPER_BOUND);
                int side2 = random.nextInt(UPPER_BOUND);
                return new Rectangle(figureColor, side1, side2);
            case ("circle"):
                int radius = random.nextInt(UPPER_BOUND);
                return new Circle(figureColor, radius);
            case ("right triangle"):
                int firstleg = random.nextInt(UPPER_BOUND);
                int secondleg = random.nextInt(UPPER_BOUND);
                return new RightTriangle(figureColor, firstleg, secondleg);
            default:
                int base1 = random.nextInt(UPPER_BOUND);
                int base2 = random.nextInt(UPPER_BOUND);
                int trapezoidSide = random.nextInt(UPPER_BOUND);
                return new IsoscelesTrapezoid(figureColor, base1, base2, trapezoidSide);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", R_DEFAULT);
    }
}

