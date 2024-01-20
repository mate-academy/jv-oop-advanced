package core.basesyntax;

public class Figure implements Area {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String info() {
        return null;
    }

    @Override
    public double area() {
        return 0;
    }
}
