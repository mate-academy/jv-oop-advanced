package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier supplier = new ColorSupplier();

    private Random generator = new Random();

    public Drawable getRandomFigure() {
        String color = supplier.getRandomColor();
        int figuresAmount = 5;
        int choice = (int)(Math.random() * figuresAmount + 1);
        switch (choice) {
            case 1:
                return new Circle(color, generator.nextInt(10) + 1);
            case 2:
                return new Square(color, generator.nextInt(10) + 1);
            case 3:
                return new Rectangle(color, generator.nextInt(10)
                        + 1,generator.nextInt(10) + 1);
            case 4:
                return new RightTriangle(color, generator.nextInt(10)
                        + 1,generator.nextInt(10) + 1);
            case 5:
                return new IsoscelesTrapezoid(color, generator.nextInt(10)
                        + 1,generator.nextInt(10) + 1,generator.nextInt(10) + 1);
            default:
                return null;
        }
    }
}
