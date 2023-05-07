package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(CreateFigures.values().length);
        switch (CreateFigures.values()[index].name()) {
            case "CIRCLE":
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(10));
            case "RIGHTTRIANGLE":
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(10));
            case "RECTANGLE":
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(10));
            case "SQUARE":
                return new Square(colorSupplier.getRandomColor(), random.nextInt(10));
            case "ISOSCELESTRAPEZOID":
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(10), random.nextInt(10));
            default: throw new RuntimeException("This object is not of required type");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

}
