package be.vdab.builder.taken;

class Coordinaat {

    private final int x;
    private final int y;
    private final int z;

    private Coordinaat(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }

    static class CoordinaatBuilder {
        private int x;
        private int y;
        private int z;

        CoordinaatBuilder metX (int x) {
            this.x = x;
            return this;
        }

        CoordinaatBuilder metY (int y) {
            this.y = y;
            return this;
        }

        CoordinaatBuilder metZ(int z) {
            this.z = z;
            return this;
        }

        Coordinaat maakCoordinaat () {
            return new Coordinaat(x, y, z);
        }
    }
}
