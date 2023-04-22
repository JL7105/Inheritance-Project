public class Fish extends Animal {
    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles() {
        System.out.print("Muscles moving");
    }

    private void moveBackFin() {
        System.out.println("Backfin Moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" + "Gills = " + gills + ", Fins = " + fins + "}" + super.toString();
    }
  
}