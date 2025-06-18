package core.basesyntax

abstract class Figure {
  protected String color;
  public Figure(String color) {
    this.color = color;
  }
  public abstract double getArea();
  public void todraw() {
    System.out.println("Figure: " + this.getClass().getSimpleName());
    System.out.println("Color: " + color);
    System.out.println("Area: " + getArea());
  }
}
