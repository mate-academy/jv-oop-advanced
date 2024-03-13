package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_RANDOM_PROPERTIES = 50;

    public Figure getRandomFigure() {
        int randomFigureValue = new Random().nextInt(NameOfFigure.values().length);
        String figureName = NameOfFigure.values()[randomFigureValue].toString();
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (figureName) {
            case "Circle":
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(new Random().nextInt(MAX_RANDOM_PROPERTIES));
                return circle;
            case "IsoscelesTrapezoid":
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setHeight(new Random().nextInt(MAX_RANDOM_PROPERTIES));
                isoscelesTrapezoid.setFirstBase(new Random().nextInt(MAX_RANDOM_PROPERTIES));
                isoscelesTrapezoid.setSecondBase(new Random().nextInt(MAX_RANDOM_PROPERTIES));
                return isoscelesTrapezoid;
            case "Rectangle":
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setLength(new Random().nextInt(MAX_RANDOM_PROPERTIES));
                rectangle.setWidth(new Random().nextInt(MAX_RANDOM_PROPERTIES));
                return rectangle;
            case "RightTriangle":
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(new Random().nextInt(MAX_RANDOM_PROPERTIES));
                rightTriangle.setSecondLeg(new Random().nextInt(MAX_RANDOM_PROPERTIES));
                return rightTriangle;
            case "Square":
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(new Random().nextInt(MAX_RANDOM_PROPERTIES));
                return square;
            default:
                break;
        }

        return null;
    }

    public Figure getDefaultFigure() {
        Circle whiteCircle = new Circle();
        whiteCircle.setRadius(10);
        whiteCircle.setColor("White");

        return whiteCircle;
    }
}
