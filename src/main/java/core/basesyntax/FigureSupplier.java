package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
            Random random = new Random();
            String color = new ColorSupplier().getRandomColor();

        return switch (random.nextInt(6)) {
            case 1 -> new RightTriangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
            case 2 ->
                    new IsoscelesTrapezoid(color, random.nextDouble() * 10, random.nextDouble() * 10, random.nextDouble() * 10);
            case 3 -> new Rectangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
            default -> new Square(color, random.nextDouble() * 10);
        };
        }
    }


