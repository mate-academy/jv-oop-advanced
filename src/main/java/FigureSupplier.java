import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1: return getRandomSquare();
            case 2: return getRandomCircle();
            case 3: return getRandomRectangle();
            case 4: return getRandomIsoscelesTrapezoid();
            case 5: return getRandomRightTriangle();
            default: return getDefaultFigure();
        }
        // generate a specific figure based on the `figureNumber` value
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("white");
        return circle;
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(10));
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(9));
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(random.nextInt(5));
        rectangle.setWigth(random.nextInt(10));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    public Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setSide1(random.nextInt(10));
        isoscelesTrapezoid.setSide2(random.nextInt(10));
        isoscelesTrapezoid.setHeight(random.nextInt(10));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setHeight(random.nextInt(10));
        rightTriangle.setSide(random.nextInt(10));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }
}
