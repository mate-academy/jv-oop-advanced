package core.basesyntax;

public abstract class Figures implements DepictionFigure, AreaCalculator {
    private String name;
    private String color;
    private double sideA;

    public Figures(String name, String color, double sideA) {
        this.name = name;
        this.color = color;
        this.sideA = sideA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

