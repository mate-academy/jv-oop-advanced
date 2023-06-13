package core.basesyntax.figure;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

  public   abstract double getArea();

   public abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
