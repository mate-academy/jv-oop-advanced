package core.basesyntax;


public abstract class Figure implements Drawable{
    protected Colour colour;
    protected double area;

    public String getColour() {
        return colour.name();
    }

    public double parsingValue(double value){
        return Double.parseDouble(String.format("%.2f", value));
    }

    public abstract double getArea();
}
