package core.basesyntax;

public class Figure implements Drawing {
    private String name;
    private String color;
    private double area;

    public Figure(String name, double area, String color) {
        this.name = name;
        this.area = area;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure: ").append(getName())
                .append(", ").append("area: ").append(getArea())
                .append(", ").append("color: ").append(getColor()).toString());
    }
}
