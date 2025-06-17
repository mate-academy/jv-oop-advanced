package core.basesyntax;

public class Figure {
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea(int side1, int side2) {
        return side1 * side2;
    }

    public String draw() {
        return "This is main Figure class";
    }
}
