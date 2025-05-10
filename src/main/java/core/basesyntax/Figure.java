package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    }

    public String getAdditionalInfo() {
        return "";
    }

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
