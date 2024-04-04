package core.basesyntax;

public abstract class Circle extends Figure implements Obtainable, Drawable {
    private static final String name = "Circle";
    private double radius;
    private double area;

    public Circle(Color color, double radius, double area, String name) {
        super(color, name);
        this.radius = radius;
        this.area = area;
    }

   @Override
   public void obtain(){
        area = radius * radius * Math.PI;
   }

   @Override
    public void draw(){
       System.out.println("Figure: " + name
               + ", Area: " + area
               + " Color: " + getColor());
   }
}
