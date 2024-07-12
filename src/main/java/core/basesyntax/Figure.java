package core.basesyntax;

public abstract class Figure implements AreaCalc, Draw {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("message");
    }
}
