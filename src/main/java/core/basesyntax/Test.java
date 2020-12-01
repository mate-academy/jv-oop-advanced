package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes = new Shape[random.nextInt(10)];
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = null;
            switch (random.nextInt(5)) {
                case 0:
                    shape = new Square(random.nextInt(100), getColor(random.nextInt(10)));
                    break;
                case 1:
                    shape = new Rectangle(random.nextInt(100), random.nextInt(100),
                            getColor(random.nextInt(10)));
                    break;
                case 2:
                    shape = new Circle(random.nextInt(100), getColor(random.nextInt(10)));
                    break;
                case 3:
                    shape = new IsoscelesTrapezoid(random.nextInt(100), random.nextInt(100),
                            random.nextInt(100), getColor(random.nextInt(10)));
                    break;
                case 4:
                    shape = new RightTriangle(random.nextInt(100), random.nextInt(100),
                            getColor(random.nextInt(10)));
                    break;
                default:
                    break;
            }
            shapes[i] = shape;
        }

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static String getColor(int number) {
        switch (number) {
            case 1:
                return "white";
            case 2:
                return "black";
            case 3:
                return "blue";
            case 4:
                return "red";
            case 5:
                return "yellow";
            case 6:
                return "brown";
            case 7:
                return "pink";
            case 8:
                return "gray";
            case 9:
                return "orange";
            default:
                return "green";
        }
    }
}
