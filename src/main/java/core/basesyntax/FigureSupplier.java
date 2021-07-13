package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int SIZE_OF_SIDES = 50;
    static final int COUNT_OF_FIGURES = 5;

    public int getRandomNum() {
        return new Random().nextInt(SIZE_OF_SIDES);
    }

    public Figure getRandomFigure() {
        int randomIndex = new Random().nextInt(COUNT_OF_FIGURES);
        ColorSupplier supplier = new ColorSupplier();
        switch (randomIndex) {
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
