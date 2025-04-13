//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public FigureSupplier() {
    }

    public Figure getRandomFigure() {
        switch (this.random.nextInt(5)) {
            case 0 -> {
                return new Square(this.colorSupplier.getRandomColor(), this.random.nextInt(10) + 1);
            }
            case 1 -> {
                return new Rectangle(this.colorSupplier.getRandomColor(), this.random.nextInt(10) + 1, this.random.nextInt(10) + 1);
            }
            case 2 -> {
                return new RightTriangle(this.colorSupplier.getRandomColor(), this.random.nextInt(10) + 1, this.random.nextInt(10) + 1);
            }
            case 3 -> {
                return new Circle(this.colorSupplier.getRandomColor(), this.random.nextInt(10) + 1);
            }
            case 4 -> {
                return new IsoscelesTrapezoid(this.colorSupplier.getRandomColor(), this.random.nextInt(10) + 1, this.random.nextInt(10) + 1, this.random.nextInt(10) + 1);
            }
            default -> {
                return this.getDefaultFigure();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10.0F);
    }
}
