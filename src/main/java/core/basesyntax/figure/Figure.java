package core.basesyntax.figure;

public class Figure implements InformationDrawer, AreaCalculator {
    private String color;
    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void toDraw() {

    }

    @Override
    public String getArea() {
        return null;
    }
}
