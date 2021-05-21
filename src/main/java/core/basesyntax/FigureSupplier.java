package core.basesyntax;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        String nameCircle = "circle";
        int randomR = (int) (Math.random() * 10);
        ColorSupplier colorCircle = new ColorSupplier();
        Figure circle = new Circle(randomR, nameCircle,
                colorCircle.getRandomColor());

        String nameTrapezoid = "isoscelesTrapezoid";
        int randomTop = (int) (Math.random() * 10);
        int randomBottom = (int) (Math.random() * 10) + 1;
        ColorSupplier colorTrapezoid = new ColorSupplier();
        int randomHeight = (int) (Math.random() * 10) + 1;
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(randomTop,
                randomBottom, randomHeight,
                nameTrapezoid, colorTrapezoid.getRandomColor());

        String nameSquare = "square";
        int randomSide = (int) (Math.random() * 10) + 1;
        ColorSupplier colorSquare = new ColorSupplier();
        Figure square = new Square(randomSide, nameSquare,
                colorSquare.getRandomColor());

        String nameRectangle = "rectangle";
        int randomSideA = (int) (Math.random() * 10);
        int randomSideB = (int) (Math.random() * 10) + 1;
        ColorSupplier colorRectangle = new ColorSupplier();
        Figure rectangle = new Rectangle(randomSideA, randomSideB,
                nameRectangle, colorRectangle.getRandomColor());

        String nameRightTriangle = "RightTriangle";
        int randomLegA = (int) (Math.random() * 10);
        int randomLegB = (int) (Math.random() * 10);
        ColorSupplier colorRightTriangle = new ColorSupplier();
        Figure rightTriangle = new RightTriangle(randomLegA, randomLegB,
                nameRightTriangle, colorRightTriangle.getRandomColor());

        Figure[] figures = new Figure[]{
                circle,
                isoscelesTrapezoid,
                square,
                rectangle,
                rightTriangle
        };
        int randomFigure = (int) (Math.random() * 5);
        return figures[randomFigure];
    }
}