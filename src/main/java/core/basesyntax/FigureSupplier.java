package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final String[] FIGURE_LIST = {"circle", "square", "right triangle",
            "rectangle", "isosceles trapezoid"};
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(FIGURE_LIST.length);
        String figureFromFigures = FIGURE_LIST[randomNumber];
        switch (figureFromFigures) {
            case "circle":
                return getRandomCircle();
            case "square":
                return getRandomSquare();
            case "right triangle":
                return getRandomRightTriangle();
            case "rectangle":
                return getRandomRectangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private Circle getRandomCircle() {
        String randomColor = color.getRandomColor();
        int randomRadius = random.nextInt(10) + 1;
        return new Circle(randomColor, randomRadius);
    }

    private Square getRandomSquare() {
        String randomColor = color.getRandomColor();
        int randomSide = random.nextInt(10) + 1;
        return new Square(randomColor, randomSide);
    }

    private RightTriangle getRandomRightTriangle() {
        String randomColor = color.getRandomColor();
        int randomLeg = random.nextInt(10) + 1;
        return new RightTriangle(randomColor, randomLeg);
    }

    private Rectangle getRandomRectangle() {
        String randomColor = color.getRandomColor();
        int randomHeight = random.nextInt(10) + 1;
        int randomWidth = random.nextInt(10) + 1;
        return new Rectangle(randomColor, randomHeight, randomWidth);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String randomColor = color.getRandomColor();
        int randomUpperSide = random.nextInt(10) + 1;
        int randomLowerSide = random.nextInt(10) + 1;
        int randomLeg = random.nextInt(10) + 1;
        int randomHeight =
                random.nextInt(10) + 1;
        return new IsoscelesTrapezoid(randomColor, randomUpperSide,
                randomLowerSide, randomHeight, randomLeg);
    }
}

