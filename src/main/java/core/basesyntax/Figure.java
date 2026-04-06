package core.basesyntax;

public abstract class Figure {

    private String color;

    public abstract double getArea();

    public void toDraw() {
        System.out.println(this);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
