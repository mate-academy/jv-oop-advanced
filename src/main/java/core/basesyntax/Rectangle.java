package core.basesyntax;

public class Rectangle extends Figure {

    public Rectangle(){
    }

    public Rectangle(int getHeight, int getWidth, String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + getClass().getSimpleName()
                + "area: " + this.getArea() + " sq.units"
                + "side: " + getWidth() + " units"
                + "color: " + this.color);
    }
}
