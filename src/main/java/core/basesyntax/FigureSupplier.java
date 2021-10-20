package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {

    private Random random = new Random();
    private String[] myFigure = {"square","rectangle","right triangle","circle",
            "isosceles trapezoid"};

    public void getRandomFigure(int figureNumber) {

        ColorSupplier colorSupplier = new ColorSupplier();

        switch (figureNumber) {
            case (0):
                Square square = new Square();
                square.getSquare(random.nextInt(25) + 1, colorSupplier.getRandomColor());
                break;
            case (1):
                Rectangle rectangle = new Rectangle();
                rectangle.getRectangle(random.nextInt(25) + 1,
                        random.nextInt(25) + 1, colorSupplier.getRandomColor());
                break;
            case (2):
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.getRightTriangle(random.nextInt(25) + 1,
                        random.nextInt(25) + 1, colorSupplier.getRandomColor());
                break;
            case (3):
                Circle circle = new Circle();
                circle.getCircle(random.nextInt(25) + 1, colorSupplier.getRandomColor());
                break;
            case (4):
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.getIsoscelesTrapezoid(
                        random.nextInt(25) + 1,
                        random.nextInt(25) + 1,
                        random.nextInt(25) + 1, colorSupplier.getRandomColor());
                break;
            default: break;
        }
    }
}
