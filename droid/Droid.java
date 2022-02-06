public class Droid {

    int batteryLevel;
    String name;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing the task: " + task);
        batteryLevel -= 10;
    }

    public void energyReport() {
        System.out.println(name + " is currently at: " + batteryLevel + " battery level!");
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        Droid markey = new Droid("Markey");
        System.out.println(codey.toString());
        System.out.println(markey.toString());
        codey.performTask("skating");
        codey.performTask("cleaning");
        codey.energyReport();
    }
}