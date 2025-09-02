package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER_OF_SIDE = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();
    public Figure getRandomFigure() {
        String[] figures = {"square", "circle", "isosceles trapezoid", "rectangle", "right triangle"};
        int index = new Random().nextInt(figures.length);
        switch (figures[index]){
            case "square": {
                Square square = new Square();
                square.color = colorSupplier.colorSupplier();
                square.side = random.nextInt(MAX_NUMBER_OF_SIDE);
                return square;
            }
            case "circle": {
                Circle circle = new Circle();
                circle.color = colorSupplier.colorSupplier();
                circle.radius = random.nextInt(MAX_NUMBER_OF_SIDE);
                return circle;
            }
            case "isosceles trapezoid": {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.color = colorSupplier.colorSupplier();
                isoscelesTrapezoid.base1 = random.nextInt(MAX_NUMBER_OF_SIDE);
                isoscelesTrapezoid.base2 = random.nextInt(MAX_NUMBER_OF_SIDE);
                isoscelesTrapezoid.height = random.nextInt(MAX_NUMBER_OF_SIDE);
                return isoscelesTrapezoid;
            }
            case "rectangle": {
                Rectangle rectangle = new Rectangle();
                rectangle.color = colorSupplier.colorSupplier();
                rectangle.height = random.nextInt(MAX_NUMBER_OF_SIDE);
                rectangle.width = random.nextInt(MAX_NUMBER_OF_SIDE);
                return rectangle;
            }
            case "right triangle": {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.color = colorSupplier.colorSupplier();
                rightTriangle.firstLeg = random.nextInt(MAX_NUMBER_OF_SIDE);
                rightTriangle.secondLeg = random.nextInt(MAX_NUMBER_OF_SIDE);
                return rightTriangle;
            }
        }
        return null;
    }
    public Figure getDefaultFigure(){
        Circle circle = new Circle();
        circle.radius = 10;
        circle.color = "white";
    return circle;
    }

}
