package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private String color;
    private String figureName;

    public void setRandomProperties() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void getInfo();

    @Override
    public abstract double getArea();

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }
}
