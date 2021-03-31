package core.basesyntax;

public class FigureSupplier {
    private final ColorSupplier colorGenerator = new ColorSupplier();
    private String color;

    public Figure randomFigure() {
        int number = (int)((Math.random() * 5) + 1);
        switch (number) {
            case 1:
                return createCircle();
            case 2:
                return createIsoscelesTrapezoid();
            case 3:
                return createRectangle();
            case 4:
                return createRightTriangle();
            case 5:
                return createSquare();
            default:
                return createSquare();
        }
    }

    public int randomProperty() {
        return (int)((Math.random() * 100) + 1);
    }

    private Figure createCircle() {
        color = colorGenerator.randomColor();
        int radius = randomProperty();
        Figure circle = new Circle(radius, color, "radius");
        return circle;
    }

    private Figure createIsoscelesTrapezoid() {
        color = colorGenerator.randomColor();
        int height = randomProperty();
        int mediumLine = randomProperty();
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(height,mediumLine,color,"medium line");
        return isoscelesTrapezoid;
    }

    private Figure createRectangle() {
        color = colorGenerator.randomColor();
        int height = randomProperty();
        int width = randomProperty();
        Figure rectangle = new Rectangle(height, width, color, "width");
        return rectangle;
    }

    private Figure createRightTriangle() {
        color = colorGenerator.randomColor();
        int catted1 = 0;
        int catted2 = 0;
        int hypotenuse = 0;
        while (catted1 + catted2 <= hypotenuse) {
            catted1 = randomProperty();
            catted2 = randomProperty();
            hypotenuse = randomProperty();
        }
        Figure rightTriangle = new RightTriangle(catted1, catted2, hypotenuse,
                color, "hypotenuse");
        return rightTriangle;
    }

    private Figure createSquare() {
        color = colorGenerator.randomColor();
        int side = randomProperty();
        Figure square = new Square(side, color, "side");
        return square;
    }
}
