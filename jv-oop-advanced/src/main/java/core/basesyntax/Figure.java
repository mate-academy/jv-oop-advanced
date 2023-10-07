package core.basesyntax;


public abstract class Figure implements Drawable {
        private Color colors;
        private Form forms;

        public Color getColors() {
                return colors;
        }

        public void setColors(Color colors) {
                this.colors = colors;
        }

        public Form getForms() {
                return forms;
        }

        public void setForms(Form forms) {
                this.forms = forms;
        }

        public Figure(Color colors, Form forms) {
                this.colors = colors;
                this.forms = forms;
        }

        @Override
        public Figure draw() {
                System.out.println("не то что надо выводит! не пойму почему с figure использует");
                return null;
        }
}

