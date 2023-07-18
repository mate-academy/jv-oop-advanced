package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier;
    private Random random = new Random();
    private final int magician = 10;
    private final int lownum = 1;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),random.nextInt(magician) + lownum);
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(magician) + 1, random.nextInt(magician) + lownum);
    }

    public RightTriangle getRandomrightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(magician) + 1, random.nextInt(magician) + lownum);
    }

    public Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(magician) + lownum);
    }

    public IsoscelesTrapezoid getRandomisoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(magician) + lownum, random.nextInt(magician)
                + lownum, random.nextInt(magician) + lownum);
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(5);
        switch (index) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomrightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
                return getRandomisoscelesTrapezoid();
            default:
                throw new IllegalArgumentException("Invalid figure index");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", magician);
    }
}
