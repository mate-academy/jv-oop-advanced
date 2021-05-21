package core.basesyntax;

public class FigureSupplier {
    public static final int RANDOM_SIZE = 10;
    public static final int RANDOM_FIGURE = 5;

    public Figure getRandomFigure() {
        String nameCircle = "circle";
        int randomR = (int) (Math.random() * RANDOM_SIZE);
        ColorSupplier colorCircle = new ColorSupplier();
        Figure circle = new Circle(nameCircle,
                colorCircle.getRandomColor(), randomR);

        String nameTrapezoid = "isoscelesTrapezoid";
        int randomTop = (int) (Math.random() * RANDOM_SIZE);
        int randomBottom = (int) (Math.random() * RANDOM_SIZE) + 1;
        ColorSupplier colorTrapezoid = new ColorSupplier();
        int randomHeight = (int) (Math.random() * RANDOM_SIZE) + 1;
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(nameTrapezoid,
                colorTrapezoid.getRandomColor(), randomTop,
                randomBottom, randomHeight);

        String nameSquare = "square";
        int randomSide = (int) (Math.random() * RANDOM_SIZE) + 1;
        ColorSupplier colorSquare = new ColorSupplier();
        Figure square = new Square(nameSquare,
                colorSquare.getRandomColor(), randomSide);

        String nameRectangle = "rectangle";
        int randomSideA = (int) (Math.random() * RANDOM_SIZE);
        int randomSideB = (int) (Math.random() * RANDOM_SIZE) + 1;
        ColorSupplier colorRectangle = new ColorSupplier();
        Figure rectangle = new Rectangle(nameRectangle,
                colorRectangle.getRandomColor(),
                randomSideA, randomSideB);

        String nameRightTriangle = "RightTriangle";
        int randomLegA = (int) (Math.random() * RANDOM_SIZE);
        int randomLegB = (int) (Math.random() * RANDOM_SIZE);
        ColorSupplier colorRightTriangle = new ColorSupplier();
        Figure rightTriangle = new RightTriangle(nameRightTriangle,
                colorRightTriangle.getRandomColor(), randomLegA, randomLegB);

        Figure[] figures = new Figure[]{
                circle,
                isoscelesTrapezoid,
                square,
                rectangle,
                rightTriangle
        };
        int randomFigure = (int) (Math.random() * RANDOM_FIGURE);
        return figures[randomFigure];
    }
}
