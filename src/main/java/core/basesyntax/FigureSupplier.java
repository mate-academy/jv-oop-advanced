package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(4)) {
            case 0:
                return new Square(random.nextInt(MAX_NUMBER), colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER), colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER), colorSupplier.getRandomColor());
            case 3:
                return new IsoscelesTrapezoid(random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER), colorSupplier.getRandomColor());
            default:
                return new Circle(random.nextInt(MAX_NUMBER), colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure(int number) {
        switch (number) {
            case 0:
                return new Square(20, Color.BLUE);
            case 1:
                return new Rectangle(20, 18,Color.WHITE);
            case 2:
                return new RightTriangle(15,13,Color.GREY);
            case 3:
                return new IsoscelesTrapezoid(11,45,Color.PINK);
            default:
                return new Circle(10,Color.WHITE);
        }
    }
}
