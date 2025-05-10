package core.basesyntax.colors;

public enum Color {
    RED {
        public String asLowerCase() {
            return RED.toString().toLowerCase();
        }
    },
    GREEN {
        public String asLowerCase() {
            return GREEN.toString().toLowerCase();
        }
    },
    GRAY {
        public String asLowerCase() {
            return GRAY.toString().toLowerCase();
        }
    },
    WHITE {
        public String asLowerCase() {
            return WHITE.toString().toLowerCase();
        }
    },
    BLACK {
        public String asLowerCase() {
            return BLACK.toString().toLowerCase();
        }
    },
    BLUE {
        public String asLowerCase() {
            return BLUE.toString().toLowerCase();
        }
    },
    PURPLE {
        public String asLowerCase() {
            return PURPLE.toString().toLowerCase();
        }
    },
    PINK {
        public String asLowerCase() {
            return PINK.toString().toLowerCase();
        }
    };

    public abstract String asLowerCase();
}
