public class helloapp3{
    public static void main(String[] args) {
        // Default name
        String name = "World";

        // Check if a name is provided
        if (args.length > 0) {
            name = args[0]; // Use the provided name
        }

        System.out.println("Hello, " + name + "!");
    }
}