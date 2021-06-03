package figure;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Double getArea() {
        return 0d;
    }

    @Override
    public void draw() {
        System.out.println("Figure - type : " + "non type" + " color : " + "have not color"
                + " area : " + getArea() + " sq.units");
    }
}
