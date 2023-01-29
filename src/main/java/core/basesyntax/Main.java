package core.basesyntax;

import java.util.Random;

public class Main {
    //    private static final int UPPER_BOUND = 100;
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static FigureForm figureForm = new FigureForm();
    private static Random random = new Random();

    public static void main(String[] args) {
        Figure[] array = new Figure[5];
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = figureSupplier.getRandomFigure();
            if (array[i] == Figure.Circle) {
                Circle circle = new Circle(random.nextInt(),
                        ColorSupplier.getRandomColor());
                circle.draw();
            }
            if (array[i] == Figure.Rectangle) {
                Rectangle rectangle = new Rectangle(random.nextInt(),
                        random.nextInt());
                rectangle.draw();
            }
            if (array[i] == Figure.Square) {
                Square square = new Square(random.nextInt());
                square.draw();
            }
            if (array[i] == Figure.IsoscelesTrapezoid) {
                IsoscelesTrapezoid isoscelesTrapezoid =
                        new IsoscelesTrapezoid(random.nextInt(),
                                random.nextInt(), random.nextInt());
                isoscelesTrapezoid.draw();
            }
            if (array[i] == Figure.RightTriangle) {
                RightTriangle rightTriangle = new RightTriangle(random.nextInt(),
                        random.nextInt());
                rightTriangle.draw();
            }
        }
        for (int j = array.length / 2; j < array.length; j++) {
            Circle circle1 = new Circle(10, "WHITE");
            circle1.draw();
        }
        System.out.println();
    }
}
