package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Shape shape;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Shape createShape() {
        Shape[] shapes = {
                new IsoscelesTrapezoid("Isosceles Trapezoid",
                colorSupplier.randomColor(),random.nextInt(20),
                        random.nextInt(20),random.nextInt(20)),
                new RightTriangle("Right Triangle", colorSupplier.randomColor(),
                        random.nextInt(20),
                        random.nextInt(20)),
                new Square("Square", colorSupplier.randomColor(),random.nextInt(20)),
                new Rectangle("Rectangle", colorSupplier.randomColor(),
                        random.nextInt(20), random.nextInt(20)),
                new Circle("Circle", colorSupplier.randomColor(), random.nextInt(20))};
        int intGen = random.nextInt(shapes.length - 1);

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
