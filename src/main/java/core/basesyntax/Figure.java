package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private double parameter;

    public Figure(String color, double parameter) {
        this.color = color;
        this.parameter = parameter;
    }

    public double getParameter() {
        return parameter;
    }

    public void setParameter(double parameter) {
        this.parameter = parameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
