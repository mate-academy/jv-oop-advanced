package core.basesyntax;
import java.util.Random;
public class FigureSupplier {
    private static final Random random = new Random();

    public static Figure getRandomFigure() {
        String color = ColorSupplier.getRandomColor();

        switch (random.nextInt(5)) {
            case 0:
                double side = random.nextDouble() * 10 + 1;
                return new Square(side, color);
            case 1:
                double width = random.nextDouble() * 10 + 1;
                double height = random.nextDouble() * 10 + 1;
                return new Rectangle(width, height, color);
            case 2:
                double sideA = random.nextDouble() * 10 + 1;
                double sideB = random.nextDouble() * 10 + 1;
                return new RightTriangle(sideA, sideB, color);
            case 3:
                double radius = random.nextDouble() * 10 + 1;
                return new Circle(radius, color);
            case 4:
                double sideT = random.nextDouble() * 10 + 1;
                double sideY = random.nextDouble() * 10 + 1;
                double height1 = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(sideT, sideY, height1, color);
            default:
                throw new RuntimeException("Unexpected figure type");
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
