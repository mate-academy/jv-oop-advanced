package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int maxFigureTypes = 5;
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(maxFigureTypes);
        int num1 = random.nextInt(9) + 1;
        int num2 = random.nextInt(9) + 1;
        String color = colorSupplier.getRandomColor();

        if (index == 0) {
            return new RightTriangle(color,num1, num2);
        } else if (index == 1) {
            return new IsoscelesTrapezoid(color,num1);
        } else if (index == 2) {
            return new Square(color,num1);
        } else if (index == 3) {
            return new Circle(color,num1);
        } else {
            return new Rectangle(color,num1,num2);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
