package core.basesyntax;

import java.util.Random;

public abstract class Figures {
    private static Random random = new Random();
    double area;
    Color color;

    public abstract void displayInfo();

    public abstract void draw();

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public static Figures getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Circle(random.nextDouble() * 25 + 1,
                        Color.getRandom());

            case 1:
                return new IsoscelesTrapezoid(random.nextDouble() * 25 + 1,
                        Math.random() * 25 + 1,
                        Math.random() * 25 + 1,
                        Color.getRandom());

            case 2:
                return new RightTriangle(random.nextDouble() * 25,
                        Math.random() * 25 + 1,
                        Color.getRandom());

            case 3:
                return new Rectangle(random.nextDouble() * 25 + 1,
                        Math.random() * 25 + 1,
                        Color.getRandom());

            case 4:
                return new Square(random.nextDouble() * 25 + 1,
                        Color.getRandom());

            default:
                return new Square(0, Color.BLACK);
        }
    }
}
