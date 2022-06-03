package core.basesyntax;

public class Figure implements Drawer, AreaCalculator {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSquare() {
        return 0;
    }

    public void getDraw() {

    }
}

