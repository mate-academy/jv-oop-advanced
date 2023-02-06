package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Square getRandomSquare() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        return new Square(random.nextInt(100), supplier.getColor());
    }

    public Circle getRandomCircle() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        return new Circle(random.nextInt(100), supplier.getColor());
    }

    public RightTriangle getRandomTriangle() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        return new RightTriangle(random.nextInt(100), random.nextInt(100), supplier.getColor());
    }

    public IsoscelesTrapezoid getRandomTrapezoid() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        return new IsoscelesTrapezoid(random.nextInt(100),
                random.nextInt(100), random.nextInt(100), supplier.getColor());
    }

    public Rectangle getRandomRectangle() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        return new Rectangle(random.nextInt(100), random.nextInt(100), supplier.getColor());
    }
}
