package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
  private static final ColorSupplier colorSupplier = new ColorSupplier();
  private static final int maxParameterValue = 50;
  private static final int maxFigureNumber = 5;
  private  static final Random random = new Random();

  public Figure getRandomFigure() {
    double randomParameter = new Random().nextInt(maxParameterValue);
    int value = random.nextInt(maxFigureNumber);
    switch (value) {
      case 0:
        return new Square(colorSupplier.getRandomColor(), randomParameter);
      case 1:
        return new Rectangle(colorSupplier.getRandomColor(), randomParameter, randomParameter);
      case 2:
        return new Circle(colorSupplier.getRandomColor(), randomParameter);
      case 3:
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomParameter, randomParameter);
      default:
        return new RightTriangle(colorSupplier.getRandomColor(), randomParameter, randomParameter);
    }
  }

  public Figure getDefaultFigure() {
    return new Circle(Color.white.name(), 10);
  }
}
