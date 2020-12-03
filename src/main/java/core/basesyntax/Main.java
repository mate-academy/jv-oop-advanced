package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String [] args) {
        int numberFigures = new Random().nextInt(10);

        Figure [] figures = new Figure[numberFigures];
        for (int i = 0; i < numberFigures; i++) {
            figures[i] = generateFigure();
            figures[i].draw();
        }
    }

    public static Figure generateFigure() {
        int randomFigure = new Random().nextInt(5);
        Color color = generateColor();
        switch (randomFigure) {
            case 0: {
                int radius = new Random().nextInt(100);
                return new Circle(radius, color);
            }
            case 1: {
                int side = new Random().nextInt(100);
                return new Square(side, color);
            }
            case 2: {
                int bottomBase = new Random().nextInt(100);
                int topBase = new Random().nextInt(bottomBase);
                int height = new Random().nextInt(90);
                return new IsoscelesTrapezoid(bottomBase, topBase, height, color);
            }
            case 3: {
                int base = new Random().nextInt(100);
                int height = new Random().nextInt(100);
                return new RightTriangle(base, height, color);
            }
            case 4:
            default: {
                int width = new Random().nextInt(100);
                int length = new Random().nextInt(100);
                return new Rectangle(width, length, color);
            }
        }
    }

    public static Color generateColor() {
        int randomIndexColor = new Random().nextInt(Color.values().length);
        return Color.values()[randomIndexColor];
    }
}
