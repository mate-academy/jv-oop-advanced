package core.basesyntax;

import java.util.Random;

public class ShapeProducer {
    private static final int NUMBER_OF_SHAPES = 5;

    public static Shape getShape() {
        Random random = new Random();
        int variant = random.nextInt(NUMBER_OF_SHAPES);
        Shape shape = null;
        switch (variant) {
            case 0:
                shape = new Square(random.nextInt(100), ColorProducer.getRandomColor());
                break;
            case 1:
                shape = new Rectangle(random.nextInt(100), random.nextInt(100),
                        ColorProducer.getRandomColor());
                break;
            case 2:
                shape = new Circle(random.nextInt(100), ColorProducer.getRandomColor());
                break;
            case 3:
                shape = new IsoscelesTrapezoid(random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), ColorProducer.getRandomColor());
                break;
            case 4:
                shape = new RightTriangle(random.nextInt(100), random.nextInt(100),
                        ColorProducer.getRandomColor());
                break;
            default:
                break;
        }
        return shape;
    }
}
