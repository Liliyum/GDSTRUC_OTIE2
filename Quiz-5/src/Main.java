public class Main {

    public static void main(String[] args) {

        String[] characters = {
                "Optimus", "Arnold", "Schwarzenegger", "Matrix", "Bumblebee", "Bombaclatt", "T-800"
        };

        System.out.println("=== Terminator9000 Begin Terminating... ===");

        // First Test
        String key = "Matrix";
        int index = Terminator9000.terminatorScan(characters, key);

        if (index != -1) {
            System.out.println("Target '" + key + "' TERMINATED at index: " + index);
        }
        else {
            System.out.println("Target '" + key + "' survived... Moving on...");
        }

        // Second Test
        key = "T-800";
        index = Terminator9000.terminatorScan(characters, key);

        if (index != -1) {
            System.out.println("Target '" + key + "' TERMINATED at index: " + index);
        }
        else {
            System.out.println("Target '" + key + "' survived... Moving on...");
        }

        // Third Test (not in the index)
        key = "Megatron";
        index = Terminator9000.terminatorScan(characters, key);

        if (index != -1) {
            System.out.println("Target '" + key + "' TERMINATED at index: " + index);
        }
        else {
            System.out.println("Target '" + key + "' survived... Moving on...");
        }
    }
}
