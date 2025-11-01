//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String instructions = """
                    Enter number of the command:
                    1. Show lists of todos;
                    2. Show todo by ID;
                    3. Add todo;
                    4. Delete todo by ID;
                    5. Edit todo by ID;\n
                """;

        System.out.println(instructions);
    }
}