package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Shape shape;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private int generateRandomValue() {
        return random.nextInt(50);
    }

    public Shape createShape() {
        Shape[] shapes = {
                new IsoscelesTrapezoid("Isosceles Trapezoid",
                colorSupplier.randomColor(), this.generateRandomValue(),
                        this.generateRandomValue(), this.generateRandomValue()),
                new RightTriangle("Right Triangle", colorSupplier.randomColor(),
                        this.generateRandomValue(),
                        this.generateRandomValue()),
                new Square("Square", colorSupplier.randomColor(), this.generateRandomValue()),
                new Rectangle("Rectangle", colorSupplier.randomColor(),
                        this.generateRandomValue(), this.generateRandomValue()),
                new Circle("Circle", colorSupplier.randomColor(), this.generateRandomValue())};
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
