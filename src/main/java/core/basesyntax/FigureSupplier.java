package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier(random);
    private final String [] array = {"square","rightTriangle","rectangle",
            "isoscelesTrapezoid","circle"};

    public Figure getRandomFigure() {
        int index = random.nextInt(array.length);
        if ("square".equals(array[index])) {
            return new Square(colorSupplier.getRandomColor(), random.nextInt(100));
        } else if ("rightTriangle".equals(array[index])) {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(100), random.nextInt(100));
        } else if ("rectangle".equals(array[index])) {
            return new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(100), random.nextInt(100));
        } else if ("isoscelesTrapezoid".equals(array[index])) {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(100),
                     random.nextInt(100), random.nextInt(100));
        }
        return new Circle(colorSupplier.getRandomColor(),random.nextInt(100));
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE",10);
    }
}
