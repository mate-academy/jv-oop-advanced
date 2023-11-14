package core.basesyntax;

public class RightTriangle extends Figure implements Drawable {
    private double base;
    private double hipotenuse;
    private double height;

    public RightTriangle(Color color, double base, double hipotenuse, double height) {
        super(color);
        this.base = base;
        this.hipotenuse = hipotenuse;
        this.height = height;
    }

    public double getArea() {
        return round((base * height) / 2);
    }

    public double getPerimeter() {

        return round(height + base + hipotenuse);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle" +
                        ", base: " + base + " units" +
                        ", hipotenuse: " + hipotenuse + " units"+
                        ", height: " + height + " units"+
                        ", area: " + getArea() +" sq. units"+
                        ", perimeter: " + getPerimeter() +" units"+
                        ", color: " + color
        );
    }
}
