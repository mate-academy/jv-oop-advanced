package core.basesyntax;

public class Figure {
    private Color color;
    private String name;
    private double area;
    private double sizeA;
    private double sizeB;
    private String text;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setSizeA(double sizeA) {
        this.sizeA = sizeA;
    }

    public void setSizeB(double sizeB) {
        this.sizeB = sizeB;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public double getSizeA() {
        return sizeA;
    }

    public double getSizeB() {
        return sizeB;
    }
}
