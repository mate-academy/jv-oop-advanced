package core.basesyntax;

public abstract class FigCol {
        private Color color;  // Using a single Color instance instead of an array

        public FigCol(Color color) {
            this.color = color;
        }

        // Getter for color (optional, depending on your use case)
        public Color getColor() {
            return color;
        }

        // You can also add a setter if needed
        public void setColor(Color color) {
            this.color = color;
        }
}