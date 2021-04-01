package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Shape shape;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int valueGenerator = random.nextInt(20);

    public Shape createShape() {
        Shape[] shapes = {
                new IsoscelesTrapezoid("Isosceles Trapezoid",
                colorSupplier.randomColor(), valueGenerator,
                        valueGenerator, valueGenerator),
                new RightTriangle("Right Triangle", colorSupplier.randomColor(),
                        valueGenerator,
                        valueGenerator),
                new Square("Square", colorSupplier.randomColor(), valueGenerator),
                new Rectangle("Rectangle", colorSupplier.randomColor(),
                        valueGenerator, valueGenerator),
                new Circle("Circle", colorSupplier.randomColor(), valueGenerator)};
        int intGen = random.nextInt(shapes.length);

        return shapes[intGen];
    }

    public Shape[] createArray() {
        int randInt = random.nextInt(15);
        Shape[] shapes = new Shape[randInt];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = createShape();
        }
        return shapes;
    }
}
