package core.basesyntax;

public class FigureSupplier {
    public static int selectRandomFigure() {
        int minFigureAmount = 1;
        int maxFigureAmount = 5;
        return (int) Math.floor(Math.random()
                * (maxFigureAmount - minFigureAmount + 1) + minFigureAmount);
    }

    public static int selectRandomValue() {
        int minFigureSide = 1;
        int maxFigureSide = 20; //figure parameters (radius, side, height etc)
        return (int) Math.floor(Math.random()
                * (maxFigureSide - minFigureSide + 1) + minFigureSide);
    }

    public static Figure getRandomCircle() {
        return new Circle(selectRandomValue(), ColorSupplier.getRandomColor());
    }

    public static Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(selectRandomValue(), selectRandomValue(),
                selectRandomValue(), ColorSupplier.getRandomColor());
    }

    public static Figure getRandomRectangle() {
        return new Rectangle(selectRandomValue(), selectRandomValue(),
                ColorSupplier.getRandomColor());
    }

    public static Figure getRandomRightTriangle() {
        return new RightTriangle(selectRandomValue(), selectRandomValue(),
                ColorSupplier.getRandomColor());
    }

    public static Figure getRandomSquare() {
        return new Square(selectRandomValue(), ColorSupplier.getRandomColor());
    }

    public static Figure getRandomFigure() {
        int selectFigure = selectRandomFigure();

        switch (selectFigure) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            case 5:
                return getRandomIsoscelesTrapezoid();
            default:
                System.out.println("Something wrong with Figure Randomizer. "
                        + "Here is your default white Circle with Radius - 1");
                return new Circle(1, "white");
        }
    }
}
