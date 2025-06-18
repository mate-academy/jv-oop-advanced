package core.basesyntax

public class IsoscelesTrapezoid extends Figure {
  private double base1, base2, height;
  public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
    super(color);
    this.base1 = base1;
    this.base2 = base2;
    this.height = height;
  }

  @Override
  public double getArea() {
    return height * ((base1 + base2) / 2);
  }

  @Override
  public void draw() {
    super.draw();
    System.out.println("Base 1 : " + base1);
    System.out.println("Base 2 : " + base2);
    System.out.println("Height : " + height);
  }
}
