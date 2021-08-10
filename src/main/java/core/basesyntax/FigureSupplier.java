package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 100;
    private static final int MIN = 1;
    private static final int NUMBER = 4; // the limit of the number of figures
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier newColour = new ColorSupplier();
        if (random.nextInt(NUMBER) == 0) {
            return new Square("square",
                    random.nextInt(MIN + (int) (Math.random() * MAX)),
                    newColour.getRandomColor());
        } else if (random.nextInt(NUMBER) == 1) {
            return new Circle("circle",
                    random.nextInt(MIN + (int) (Math.random() * MAX)),
                    newColour.getRandomColor());
        } else if (random.nextInt(NUMBER) == 2) {
            return new IsoscelesTrapezoid("isosceles trapezoid",
                    random.nextInt(MIN + (int) (Math.random() * MAX)),
                    random.nextInt(MIN + (int) (Math.random() * MAX)),
                    random.nextInt(MIN + (int) (Math.random() * MAX)),
                    newColour.getRandomColor());
        } else if (random.nextInt(NUMBER) == 3) {
            return new RightTriangle("right triangle",
                    random.nextInt(MIN + (int) (Math.random() * MAX)),
                    random.nextInt(MIN + (int) (Math.random() * MAX)),
                    newColour.getRandomColor());
        }
        return new Rectangle("rectangle",
                random.nextInt(MIN + (int) (Math.random() * MAX)),
                random.nextInt(MIN + (int) (Math.random() * MAX)),
                newColour.getRandomColor());
    }
}
