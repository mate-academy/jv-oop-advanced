package core.basesyntax;

public class FigureSupplier {
    public static final int RANDOM_SIZE = 10;
    public static final int FIGURES_AMOUNT = 5;

    public Figure getRandomFigure() {
        String nameCircle = "circle";
        int randomR = (int) (Math.random() * RANDOM_SIZE) + 1;
        ColorSupplier colorFigure = new ColorSupplier();
        Figure circle = new Circle(nameCircle,
                colorFigure.getRandomColor(), randomR);

        String nameTrapezoid = "isoscelesTrapezoid";
        int randomTop = (int) (Math.random() * RANDOM_SIZE) + 1;
        int randomBottom = (int) (Math.random() * RANDOM_SIZE) + 2;
        int randomHeight = (int) (Math.random() * RANDOM_SIZE) + 1;
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(nameTrapezoid,
                colorFigure.getRandomColor(), randomTop,
                randomBottom, randomHeight);

        String nameSquare = "square";
        int randomSide = (int) (Math.random() * RANDOM_SIZE) + 1;
        Figure square = new Square(nameSquare,
                colorFigure.getRandomColor(), randomSide);

        String nameRectangle = "rectangle";
        int randomSideA = (int) (Math.random() * RANDOM_SIZE) + 1;
        int randomSideB = (int) (Math.random() * RANDOM_SIZE) + 2;
        Figure rectangle = new Rectangle(nameRectangle,
                colorFigure.getRandomColor(),
                randomSideA, randomSideB);

        String nameRightTriangle = "RightTriangle";
        int randomLegA = (int) (Math.random() * RANDOM_SIZE) + 1;
        int randomLegB = (int) (Math.random() * RANDOM_SIZE) + 1;
        Figure rightTriangle = new RightTriangle(nameRightTriangle,
                colorFigure.getRandomColor(), randomLegA, randomLegB);

        Figure[] figures = new Figure[]{
                circle,
                isoscelesTrapezoid,
                square,
                rectangle,
                rightTriangle
        };
        int randomFigure = (int) (Math.random() * FIGURES_AMOUNT);
        return figures[randomFigure];
    }
}
