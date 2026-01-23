package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Behavior getRandomFigure() {
        int type = random.nextInt(5);

        return switch (type) {
            case 0 -> new Square(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
            case 1 -> new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(10) + 1,
                    random.nextInt(10) + 1);
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(10) + 1,
                    random.nextInt(10) + 1);
            case 3 -> new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(10) + 1);
            default -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    10, 6, 5);
        };
    }

    public Behavior getDefaultFigure(){
        return new Circle(Colors.WHITE.name(), 10);
    }
}
