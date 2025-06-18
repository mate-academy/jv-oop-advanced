package core.basesyntax

public class RightTriangle extends Figure {
  private double base, height;
  public RightTriangle(String color, double base, double height) {
    super(color);
    this.base = base;
    this.height = height;
  }

  @Override
  public double getArea() {
    return 0.5 * base * height;
  }

  @Override
  public void draw() {
    super.draw();
    System.out.println("Base: " + base);
    System.out.println("Height: " + height);
  }
}
