package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
private final Random random = new Random();
private final ColorSupplier colorSupplier = new ColorSupplier();

    private final Circle circle = new Circle();
    private final Square square = new Square();
    private final IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
    private final RightTriangle rightTriangle = new RightTriangle();
    private final Rectangle rectangle = new Rectangle();
    public Figure getRandomFigure() {

        Figure[] randomFigures = new Figure[]{
                circle,
                square,
                isoscelesTrapezoid,
                rightTriangle,
                rectangle
        };

        final int randomIndex = random.nextInt(randomFigures.length + 1);
        Figure figures = randomFigures[0];
double sas = random.nextDouble();
            for (int i = 0; i < randomIndex; i++) {
                if (randomFigures[i].equals(circle)) {
                circle.setRadius(random.nextDouble());
                circle.setColor(colorSupplier.getRandomColor());
                figures = circle;
            }
                if (randomFigures[i].equals(square)) {
                square.setSide(random.nextDouble());
                square.setColor(colorSupplier.getRandomColor());
                figures = square;
            }
                if (randomFigures[i].equals(isoscelesTrapezoid)) {
                isoscelesTrapezoid.setHeight(random.nextDouble());
                isoscelesTrapezoid.setSideA(random.nextDouble());
                isoscelesTrapezoid.setSideB(random.nextDouble());
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                figures = isoscelesTrapezoid;
            }
                if (randomFigures[i].equals(rightTriangle)) {
                rightTriangle.setHeight(random.nextDouble());
                rightTriangle.setBase(random.nextDouble());
                rightTriangle.setColor(colorSupplier.getRandomColor());
                figures = rightTriangle;
            }
                if (randomFigures[i].equals(rectangle)) {
                rectangle.setLength(random.nextDouble());
                rectangle.setWidth(random.nextDouble());
                rectangle.setColor(colorSupplier.getRandomColor());
                figures = rectangle;
            }
        }
        return figures;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(String.valueOf(Color.WHITE));
        circle.setRadius(10);
        return circle;
    }
}
