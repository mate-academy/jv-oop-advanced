package core.basesyntax;

    public class Circle extends Figure implements AreaCalculator, Drawable {
        private double radius;

        public Circle(double radius, Color color) {
            super(color);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }


        @Override
        public void draw() {
            System.out.println("Circle area: " + getArea() + " sq. units, radius: " + getRadius() + " units, color: " + getColor());
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }