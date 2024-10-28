package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int number = random.nextInt(5);

        switch (number) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),random.nextInt(25));
            case 1:
                return new Square(colorSupplier.getRandomColor(),random.nextInt(25)); //квадрат
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),random.nextInt(25),
                        random.nextInt(25));//прямоугольник
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(25),12);//прямоугольный треугольник
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(25), random.nextInt(25),25);//равнобедренная трапеция
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(),10);
    }
}
