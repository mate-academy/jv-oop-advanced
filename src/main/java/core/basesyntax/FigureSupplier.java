package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int SIZE_COUNT = 15;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    // створюються фігури з рандомними значеннями параметрів

    public Figure getRandomFigure() {
        Circle circle = new Circle();
        circle.setName("circle");
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(SIZE_COUNT));

        Square square = new Square();
        square.setName("square");
        square.setColor(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(SIZE_COUNT));

        Rectangle rectangle = new Rectangle();
        rectangle.setName("rectangle");
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.setFirstSide(random.nextInt(SIZE_COUNT));
        rectangle.setSecondSide(random.nextInt(SIZE_COUNT));

        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setName("right triangle");
        rightTriangle.setColor(colorSupplier.getRandomColor());
        rightTriangle.setFirstLeg(random.nextInt(SIZE_COUNT));
        rightTriangle.setSecondLeg(random.nextInt(SIZE_COUNT));

        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setName("isosceles trapezoid");
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        isoscelesTrapezoid.setFirstBase(random.nextInt(SIZE_COUNT));
        isoscelesTrapezoid.setSecondBase(random.nextInt(SIZE_COUNT));
        isoscelesTrapezoid.setHeight(random.nextInt(SIZE_COUNT));

        // створюється масив фігур та здійснюється рандомний вибір з масиву

        Figure[] figures = new Figure[]{circle, square, rectangle, rightTriangle,
                isoscelesTrapezoid};
        return figures[new Random().nextInt(FIGURE_COUNT)];
    }

    // створюється фігура з дефолтними параметрами
    public Figure getDefaultFigure() {
        Circle circleDefault = new Circle();
        circleDefault.setName("circle");
        circleDefault.setColor(Color.WHITE);
        circleDefault.setRadius(10);
        return circleDefault;
    }
}
