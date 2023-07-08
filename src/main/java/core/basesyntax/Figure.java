package core.basesyntax;

public abstract class Figure implements Drawable, Calculable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract String getAdditionalInfo();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea() + " sq.units, " + getAdditionalInfo()
                + ", color: " + getColor());
    }
}
