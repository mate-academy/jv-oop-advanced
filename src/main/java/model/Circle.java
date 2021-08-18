package model;

class Circle extends Figure {
    private int radius;

    public Circle(int[] params, Color color) {
        super(color);
        setRadius(params[0]);
        setColour(color);
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String getFigureName() {
        return "circle";
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        String result = Double.toString(area).substring(0, Double.toString(area).indexOf('.') + 2);
        return Double.valueOf(result);

    }

    @Override
    public void drow() {
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea() + " sq.units"
                + ", radius: " + getRadius() + " units"
                + ", color: " + getColor());
    }

    private void setParams(int[] params, Color color) {
        setRadius(params[0]);
        setColour(color);
    }
}
