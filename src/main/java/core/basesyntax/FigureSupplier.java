package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER_OF_SIDE = 100;
    private static final int NUMBER_OF_FIGURES = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    public Figure getRandomFigure() {
        String[] figures = {"square", "circle", "isosceles trapezoid", "rectangle", "right triangle"};
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (figures[index]){
            case "square": {
                Square square = new Square();
                String color = colorSupplier.getRandomColor();
                int side = random.nextInt(MAX_NUMBER_OF_SIDE);
                square.setColor(color);
                square.setSide(side);
                return square;
            }
            case "circle": {
                Circle circle = new Circle();
                String color = colorSupplier.getRandomColor();
                int radius = random.nextInt(MAX_NUMBER_OF_SIDE);
                circle.setColor(color);
                circle.setRadius(radius);
                return circle;
            }
            case "isosceles trapezoid": {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                String color = colorSupplier.getRandomColor();
                int base1 = random.nextInt(MAX_NUMBER_OF_SIDE);
                int base2 = random.nextInt(MAX_NUMBER_OF_SIDE);
                int height = random.nextInt(MAX_NUMBER_OF_SIDE);
                isoscelesTrapezoid.setColor(color);
                isoscelesTrapezoid.setBase1(base1);
                isoscelesTrapezoid.setBase2(base2);
                isoscelesTrapezoid.setHeight(height);
                return isoscelesTrapezoid;
            }
            case "rectangle": {
                Rectangle rectangle = new Rectangle();
                String color = colorSupplier.getRandomColor();
                int height = random.nextInt(MAX_NUMBER_OF_SIDE);
                int width = random.nextInt(MAX_NUMBER_OF_SIDE);
                rectangle.setColor(color);
                rectangle.setHeight(height);
                rectangle.setWidth(width);
                return rectangle;
            }
            case "right triangle": {
                RightTriangle rightTriangle = new RightTriangle();
                String color = colorSupplier.getRandomColor();
                int firstLeg = random.nextInt(MAX_NUMBER_OF_SIDE);
                int secondLeg = random.nextInt(MAX_NUMBER_OF_SIDE);
                rightTriangle.setColor(color);
                rightTriangle.setFirstLeg(firstLeg);
                rightTriangle.setSecondLeg(secondLeg);
                return rightTriangle;
            }
        }
        return getDefaultFigure();
    }
    public Figure getDefaultFigure(){
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("white");
    return circle;
    }

}
