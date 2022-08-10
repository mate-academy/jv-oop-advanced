package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        RightTriangle rightTriangle = new RightTriangle();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();

        Figure[] array = new Figure[6];
        for (int i = 0; i < 6; i++) {

            if (array[i] == array[2]) {
                array[i] = figureSupplier.getRandomFigure();

            } else {
                array[i] = figureSupplier.getDefaultFigure();
                circle.setRadius(10);
                circle.setColor(Color.WHITE.name());
            }

            switch (array[i]) {
                case SQUARE:
                    square.drawFigure();
                    break;
                case CIRCLE:
                    circle.drawFigure();
                    break;
                case RECTANGLE:
                    rectangle.drawFigure();
                    break;
                case RIGHT_TRIANGLE:
                    rightTriangle.drawFigure();
                    break;
                default:
                    isoscelesTrapezoid.drawFigure();

            }

        }

    }
}
