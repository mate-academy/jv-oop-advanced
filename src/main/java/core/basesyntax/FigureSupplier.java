package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int amount = 6;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int choice = random.nextInt(amount);
        switch (choice) {
            case (0):
                String randomColor = colorSupplier.getRandomColor();
                int side = random.nextInt(30);
                Square square = new Square(side, getRandomFigure().getColour());
                square.setColour(randomColor);
                return square;
            case (1):
                randomColor = colorSupplier.getRandomColor();
                int width = random.nextInt(30);
                int height = random.nextInt(30);
                Rectangle rectangle = new Rectangle(width, height, getRandomFigure().getColour());
                rectangle.setColour(randomColor);
                return rectangle;
            case (2):
                randomColor = colorSupplier.getRandomColor();
                int firstLeg = random.nextInt(30);
                int secondLeg = random.nextInt(30);
                RightTriangle righttriangle = new RightTriangle(firstLeg, secondLeg,
                        getRandomFigure().getColour());
                righttriangle.setColour(randomColor);
                return righttriangle;
            case (3):
                randomColor = colorSupplier.getRandomColor();
                int radius = random.nextInt(30);
                Circle circle = new Circle(radius, getRandomFigure().getColour());
                circle.setColour(randomColor);
                return circle;
            case (4):
                randomColor = colorSupplier.getRandomColor();
                int upperbase = random.nextInt(30);
                int lowerbase = random.nextInt(30);
                int trapezoidheight = random.nextInt(30);
                IsoscelesTrapezoid isoscelestrapezoid = new IsoscelesTrapezoid(upperbase, lowerbase,
                        trapezoidheight, getRandomFigure().getColour());
                isoscelestrapezoid.setColour(randomColor);
                return isoscelestrapezoid;
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}


