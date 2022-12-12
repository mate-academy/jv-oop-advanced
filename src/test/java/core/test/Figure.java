package core.test;

public class Figure implements AreaCalculator, DrawFigure{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
