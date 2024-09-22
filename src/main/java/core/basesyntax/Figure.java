package core.basesyntax;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        moreInfo();
        System.out.println("Area: " + getArea() + " sq. units");
        System.out.println("Color: " + color);
        System.out.println();
    }

    protected abstract void moreInfo();
}
