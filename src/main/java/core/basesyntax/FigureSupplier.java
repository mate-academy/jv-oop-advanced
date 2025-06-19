package core.basesyntax;
import java.util.Random;

public class FigureSupplier {
    public int getRandomInt() {
        return new Random().nextInt(1,21);
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }

    public Figure getRandomFigure() {

      /*  Figure[] figures = {0 new Circle(), 1 new Square(), 2 new Rectangle(),
      3 new IsoscelesTrapezoid, 4 new RightTriangle()};
       */

        final int FIGURE_COUNT = 5;
        int randomFigureIndex = new Random().nextInt(FIGURE_COUNT);
        Figure randomFigure = getDefaultFigure();

        if (randomFigureIndex == 0) {
            Circle circle = new Circle();
            randomFigure = circle;
            circle.radius = getRandomInt();
            circle.color = new ColorSupplier().getRandomColor();
        }
        if (randomFigureIndex == 1) {
            Square square = new Square();
            randomFigure = square;
            square.side = getRandomInt();
            square.color = new ColorSupplier().getRandomColor();
        }
        if (randomFigureIndex == 2) {
            Rectangle rectangle = new Rectangle();
            randomFigure = rectangle;
            rectangle.width = getRandomInt();
            rectangle.height = getRandomInt();
            rectangle.color = new ColorSupplier().getRandomColor();
        }
        if (randomFigureIndex == 3) {
            IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
            randomFigure = isoscelesTrapezoid;
            isoscelesTrapezoid.height = getRandomInt();
            isoscelesTrapezoid.bottom = getRandomInt();
            isoscelesTrapezoid.top = getRandomInt();
            isoscelesTrapezoid.color = new ColorSupplier().getRandomColor();
        }
        if (randomFigureIndex == 4) {
            RightTriangle rightTriangle = new RightTriangle();
            randomFigure = rightTriangle;
            rightTriangle.firstLeg = getRandomInt();
            rightTriangle.secondLeg = getRandomInt();
            rightTriangle.color = new ColorSupplier().getRandomColor();
        }
        return randomFigure;
    }
}
