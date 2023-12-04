package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        int bound = 100;
        Figure[] array = {new Square(new ColorSupplier().getRandomColor(), random.nextInt(bound)),
                new RightTriangle(new ColorSupplier().getRandomColor(), random.nextInt(bound),
                        random.nextInt(bound)),
                new Rectangle(new ColorSupplier().getRandomColor(), random.nextInt(bound),
                        random.nextInt(bound)),
                new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(), random.nextInt(bound),
                        random.nextInt(bound), random.nextInt(bound)),
                new Circle(Color.WHITE.toString(), 10)

        };
        return array[random.nextInt(4)];

    }
}
