package core.basesyntax;

public class IsoscelessTrapezoid implements Figure, Draw {
    private String color;
    private double height;
    private double top;
    private double bot;
    IsoscelessTrapezoid(String color,double height, double top, double bot){
        this.top = top;
        this.bot = bot;
        this.height = height;
        this.color = color;
    }
    public double getArea(){
        return 0.5 * (top + bot) * height;
    }
    public void draw(){
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, top: " + top + " units, bottom: " + bot + " units, height: " + height + " units, color: " + color);
    }
}
