package core.basesyntax;

public class Figure implements GetArea {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void getArea() {

    }
}
