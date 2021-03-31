package core.basesyntax;

public abstract class Figure {
    private String color;
    private String property;
    private int propertyLength;
    private double area;

    public void setPropertyLength(int propertyLength) {
        this.propertyLength = propertyLength;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String draw(Figure figure) {
        return "Figure{" + figure.getClass().toString().replace("core.basesyntax.", "")
                + ", area: " + String.format("%.1f", area) + " sq. units, "
                + property + ": " + propertyLength
                + " units, color: " + color
                + '}';
    }
}
