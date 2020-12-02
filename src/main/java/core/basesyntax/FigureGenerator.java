package core.basesyntax;

import java.util.Random;

public class FigureGenerator {
    private static int AVAILABLESHAPESNUMBER = 5;

    public Figures get() {
        Random rand = new Random();
        ColorProducer cp = new ColorProducer();
        switch (rand.nextInt(AVAILABLESHAPESNUMBER)) {
            case 0:
                Circle circle = new Circle();
                circle.setColor(cp.get());
                circle.setRadius(rand.nextInt(10));
                circle.setArea();
                return circle;

            case 1:
                IzoscelesTrapezoid trapezoid = new IzoscelesTrapezoid();
                trapezoid.setColor(cp.get());
                trapezoid.setParameters(rand.nextInt(10) + 2, rand.nextInt(10),
                        rand.nextInt(10));
                trapezoid.setArea();
                return trapezoid;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(cp.get());
                rectangle.setParameters(rand.nextInt(20), rand.nextInt(10));
                rectangle.setArea();
                return rectangle;
            case 3:
                RightTriangle triangle = new RightTriangle();
                triangle.setColor(cp.get());
                triangle.setParameters(rand.nextInt(10), rand.nextInt(10));
                triangle.setArea();
                return triangle;
            default:
                Square square = new Square();
                square.setColor(cp.get());
                square.setParameters(rand.nextInt(10));
                square.setArea();
                return square;

        }
    }
}
