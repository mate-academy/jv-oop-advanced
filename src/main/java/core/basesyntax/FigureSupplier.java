package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
            Random random = new Random();
            String color = new ColorSupplier().getRandomColor();
            switch (random.nextInt(3)) {
                case 0:
                    return new Square(color, random.nextDouble() * 10);
                case 1:
                    return new RightTriangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
                case 2:
                    return new IsoscelesTrapezoid(color, random.nextDouble() * 10, random.nextDouble() * 10, random.nextDouble() * 10);
                case 3:
                    return new Rectangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
                default:
                    return new Square(color, random.nextDouble() * 10);
            }
        }
    }


