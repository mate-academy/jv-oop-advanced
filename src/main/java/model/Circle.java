package model;

class Circle extends Figure implements FiguresBehaviour {
    private int radius;

    public Circle(String color) {
        super(color);
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

    @Override
   public void setParams(int[] params) {
        setRadius(params[0]);
    }
}


