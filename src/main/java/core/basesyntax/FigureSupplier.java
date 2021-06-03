package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public int getRandomNum() {
        return new Random().nextInt(50);
    }

    public Figure getRandomFigure() {
        int getRandomIndex = new Random().nextInt(5);
        ColorSupplier supplier = new ColorSupplier();
        switch (getRandomIndex) {
            case 1:
                return new Circle(supplier.getRandomColor(), getRandomNum());
            case 2:
                return new Rectangle(supplier.getRandomColor(), getRandomNum(),getRandomNum());
            case 3:
                return new IsoscelesTrapezoid(supplier.getRandomColor(),
                        getRandomNum(),
                        getRandomNum(),
                        getRandomNum());
            case 4:
                return new Square(supplier.getRandomColor(), getRandomNum());
            default:
                return new RightTriangle(supplier.getRandomColor(), getRandomNum(), getRandomNum());
        }
    }
}
