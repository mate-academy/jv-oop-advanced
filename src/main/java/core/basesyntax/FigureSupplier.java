package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LIMIT = 6;
    private ColorSupplier color = new ColorSupplier();

    public Shapes[] randomFigure() {

        Random random = new Random();
        int ran1 = random.nextInt(LIMIT);
        Shapes[] shape = new Shapes[ran1];
        for (int i = 0; i < shape.length; i++) {
            switch (ran1) {
                case 1:

                    shape[i] = new Circle(random.nextInt(20),
                            color.randomColor());
                    break;
                case 2:
                    shape[i] = new Square(random.nextInt(12), color.randomColor());
                    break;
                case 3:
                    shape[i] = new Rectangle(random.nextInt(5), random.nextInt(5),
                            color.randomColor());
                    break;
                case 4:
                    shape[i] = new IsoscelesTrapezoid(random.nextInt(12), random.nextInt(9),
                            color.randomColor());
                    break;
                case 5:
                    shape[i] = new RightTriangle(random.nextInt(12),
                            random.nextInt(8),
                            color.randomColor());
                    break;
                default:
                    break;
            }

        }
        return shape;
    }

}



