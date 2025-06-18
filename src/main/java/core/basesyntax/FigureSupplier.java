package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
  private static final String DEFAULT_COLOR = "White";
  private static final double DEFAULT_RADIUS = 10;
  Random random = new Random();
  int figureType = random.nextInt(5);
  
  public Figure getRandomFigure() {
    switch (figureType) {
      case 0:
        return new Square(new ColorSupplier().getRandomColor(), (random.nextDouble(10)) + 1);
      case 1:
        return new Rectangle(new ColorSupplier().getRandomColor(), (random.nextDouble(10)) + 1, (random.nextDouble(10)) + 1);
      case 2:
        return new RightTriangle(new ColorSupplier().getRandomColor(), (random.nextDouble(10)) + 1, (random.nextDouble(10)) + 1);
      case 3:
        return new Circle(new ColorSupplier().getRandomColor(), (random.nextDouble(10)) + 1);
      case 4:
        return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(), (random.nextDouble(10)) + 1, (random.nextDouble(10)) + 1, (random.nextDouble(10)) + 1);
      default:
        return getDefaultFigure();
    }
  }
  public Figure getDefaultFigure() {
    return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
  }
}
