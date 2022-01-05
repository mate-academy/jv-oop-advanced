public class Circle extends Figure {
    private double radius;

    public Circle(String color,String figureType, double radius) {
        super(color,figureType);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double setRadius(double radius) {
        this.radius = radius;
        return  radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;

    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getFigureType() + "," + " area: " + Math.round(getArea()*100.0)/100.0 + " sq.units," +
               " radius: " + radius + " units," + " color: " + getColor());
    }


}
