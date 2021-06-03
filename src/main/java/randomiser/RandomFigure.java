package randomiser;

import figures.Circle;
import figures.Figure;
import figures.IsoscelesTrapezoid;
import figures.Rectangle;
import figures.RightTriangle;
import figures.Square;
import java.util.Random;

public class RandomFigure {
    private static final Random rnd = new Random();

    private RandomFigure() {
    }

    public static Figure[] getRandomFigures() {
        Figure[] figures = new Figure[rnd.nextInt(10)];

        int temp;
        Color color;

        for (int i = 0; i < figures.length; i++) {
            temp = rnd.nextInt(5);
            color = RandomColor.getRandomColor();
            switch (temp) {
                case 0:
                    figures[i] = new IsoscelesTrapezoid(color, getDouble(), getDouble(),
                        getDouble());
                    break;
                case 1:
                    figures[i] = new Circle(color, rnd.nextDouble() * 10);
                    break;
                case 2:
                    figures[i] = new Square(color, getDouble());
                    break;
                case 3:
                    figures[i] = new RightTriangle(color, getDouble(), getDouble());
                    break;
                case 4:
                    figures[i] = new Rectangle(color, getDouble(), getDouble());
                    break;
                default:
                    figures[i] = getFigure();
                    break;
            }
        }
        return figures;
    }

    private static Figure getFigure() {
        return new Figure(Color.WHITE) {
            @Override
            public double getSquare() {
                return 0;
            }

            @Override
            protected double getPerimeter() {
                return 0;
            }

            @Override
            public void draw() {

            }
        };
    }

    private static double getDouble() {
        return rnd.nextDouble() + rnd.nextInt(25);
    }
}
