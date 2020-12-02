package core.basesyntax;

public class Rectangle extends Figure{

    private double width;
    private double height;

    Rectangle(double width, double height, Color color){
        setWidth(width);
        setHeight(height);
        setColor(color);
        setArea(width, height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    @Override
    public double getArea() {
        return super.getArea();
    }


    public void setArea(double width, double height) {
        super.setArea(width*height);
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + getArea() + " sq. units"
                + " height: " + getHeight() + " units, " + " width: "
                + getWidth() + " units, color: " + getColor();
    }
}
