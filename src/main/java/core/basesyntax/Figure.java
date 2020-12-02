package core.basesyntax;


public abstract class Figure {
    protected Colour colour;
    protected double area;


    public void draw() {
        System.out.println(getClass().getSimpleName() + " is draw");
    }

    public String getColour() {
        return colour.name();
    }

    public double parsingValue(double value){
        return Double.parseDouble(String.format("%.2f", value));
    }

    public abstract double getArea();
}
