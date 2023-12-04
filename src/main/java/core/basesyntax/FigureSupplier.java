package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {

        int bound = 100;
        Figure[] array = {new Square(new ColorSupplier().getRandomColor(), random.nextInt(bound)),
                new RightTriangle(new ColorSupplier().getRandomColor(), random.nextInt(bound),
                        random.nextInt(bound)),
                new Rectangle(new ColorSupplier().getRandomColor(), random.nextInt(bound),
                        random.nextInt(bound)),
                new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(), random.nextInt(bound),
                        random.nextInt(bound), random.nextInt(bound)),
                new Circle(new ColorSupplier().getRandomColor(), random.nextInt(bound))

        };
        return array[random.nextInt(4)];
    }
    public Figure getDefaultFigure(){
        return new Circle(Color.WHITE.toString(), 10);
    }
}
