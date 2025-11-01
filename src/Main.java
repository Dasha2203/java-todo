//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String instructions = """
                    Enter the command:\n
                    1. Show lists of todos;\n
                    2. Show todo by ID;\n
                    3. Add todo;\n
                    4. Delete todo by ID;\n
                    5. Edit todo by ID;\n
                """;

        System.out.println(instructions);
    }
}