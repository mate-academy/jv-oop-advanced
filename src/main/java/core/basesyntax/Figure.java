package core.basesyntax;

public class Figure implements CalculateArea {
    public static final String defaultColor = "WHITE";
    private String color;

    public void drawArea() {

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
