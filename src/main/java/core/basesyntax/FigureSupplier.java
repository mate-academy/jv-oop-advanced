package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();
    private int figureBond = 5;
    private int sizeBond = 100;

    public Figure getRandomFigure() {
        Color[] colors = Color.values();
        switch (random.nextInt(figureBond)) {
            case 0:
                return new Circle(random.nextInt(sizeBond),
                        colors[random.nextInt(Color.values().length)]);
            case 1:
                return new Square(random.nextInt(sizeBond),
                        colors[random.nextInt(Color.values().length)]);
            case 2:
                return new Rectangle(random.nextInt(sizeBond), random.nextInt(sizeBond),
                        colors[random.nextInt(Color.values().length)]);
            case 3:
                return new RightTriangle(random.nextInt(sizeBond), random.nextInt(sizeBond),
                        colors[random.nextInt(Color.values().length)]);
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(sizeBond), random.nextInt(sizeBond),
                        random.nextInt(sizeBond), colors[random.nextInt(Color.values().length)]);
            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.white);
    }
}
