package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER_OF_SIDE = 100;
    private static final int MAX_OF_GENERATED_NUMBER = 5;
    ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    public Figure getRandomFigure() {
        String[] figures = {"square", "circle", "isosceles trapezoid", "rectangle", "right triangle"};
        int index = random.nextInt(MAX_OF_GENERATED_NUMBER);
        switch (figures[index]){
            case "square": {
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextInt(MAX_NUMBER_OF_SIDE));
                return square;
            }
            case "circle": {
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(MAX_NUMBER_OF_SIDE));
                return circle;
            }
            case "isosceles trapezoid": {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setBase1(random.nextInt(MAX_NUMBER_OF_SIDE));
                isoscelesTrapezoid.setBase2(random.nextInt(MAX_NUMBER_OF_SIDE));
                isoscelesTrapezoid.setHeight(random.nextInt(MAX_NUMBER_OF_SIDE));
                return isoscelesTrapezoid;
            }
            case "rectangle": {
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setHeight(random.nextInt(MAX_NUMBER_OF_SIDE));
                rectangle.setWidth(random.nextInt(MAX_NUMBER_OF_SIDE));
                return rectangle;
            }
            case "right triangle": {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(MAX_NUMBER_OF_SIDE));
                rightTriangle.setSecondLeg(random.nextInt(MAX_NUMBER_OF_SIDE));
                return rightTriangle;
            }
        }
        return new Circle();
    }
    public Figure getDefaultFigure(){
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("white");
    return circle;
    }

}
