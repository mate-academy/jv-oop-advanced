package core.basesyntax;

public class Figure implements InformationDrawer, AreaCalculator {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {

    }

    @Override
    public int getArea() {
        return 0;
    }
}
