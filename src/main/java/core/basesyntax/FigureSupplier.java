package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Shape shape;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int VALUE_GENERATOR = random.nextInt(20);

    public Shape createShape() {
        Shape[] shapes = {
                new IsoscelesTrapezoid("Isosceles Trapezoid",
                colorSupplier.randomColor(),VALUE_GENERATOR,
                        VALUE_GENERATOR,VALUE_GENERATOR),
                new RightTriangle("Right Triangle", colorSupplier.randomColor(),
                        VALUE_GENERATOR,
                        VALUE_GENERATOR),
                new Square("Square", colorSupplier.randomColor(),VALUE_GENERATOR),
                new Rectangle("Rectangle", colorSupplier.randomColor(),
                        VALUE_GENERATOR,VALUE_GENERATOR),
                new Circle("Circle", colorSupplier.randomColor(), VALUE_GENERATOR)};
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
