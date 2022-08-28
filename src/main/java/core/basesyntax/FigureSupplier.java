package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIZE = 10; // to keep random sizes positive
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        String color = new ColorSupplier().getRandomColor();
        switch (index) {
            case 1: {
                int radius = random.nextInt(MAX_SIZE);
                return new Circle(color, radius);
            }
            case 2: {
                int firstSide = random.nextInt(MAX_SIZE);
                int secondSide = random.nextInt(MAX_SIZE);
                int height = random.nextInt(MAX_SIZE);
                return new IsoscelesTrapezoid(color, firstSide, secondSide, height);
            }
            case 3: {
                int firstSide = random.nextInt(MAX_SIZE);
                int secondSide = random.nextInt(MAX_SIZE);
                return new Rectangle(color, firstSide, secondSide);
            }
            case 4: {
                int firstLeg = random.nextInt(MAX_SIZE);
                int secondLeg = random.nextInt(MAX_SIZE);
                return new RightTriangle(color, firstLeg, secondLeg);
            }
            default: {
                int side = random.nextInt(MAX_SIZE);
                return new Square(color, side);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

}
