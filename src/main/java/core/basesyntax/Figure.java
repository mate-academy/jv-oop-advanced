package core.basesyntax;

public abstract class Figure implements Drawing {
    private String colorfigure;
    private double calcutateArea;


    public double getcalcutateArea() {
        return calcutateArea;
    }

    public String getColor() {
        return colorfigure;
    }

    public void setColor(String color) {
        this.colorfigure = color;
    }
}


