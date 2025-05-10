package core.basesyntax;

public class Default implements Figure {
    private String color;

    public Default(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getProperty() {
        return 0;
    }

    @Override
    public void draw() {

    }

    public String getColor() {
        return color;
    }

}
