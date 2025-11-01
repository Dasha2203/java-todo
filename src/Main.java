import todo.ToDo;
import todo.ToDoList;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        boolean isWorking = true;
        Scanner scanner = new Scanner(System.in);

        ToDoList toDoList = new ToDoList(new ToDo[10]);

        String instructions = """
                Enter number of the command:
                
                1. Show lists of todos;
                2. Show todo by ID;
                3. Add todo;
                4. Delete todo by ID;
                5. Edit todo by ID;
                
                ==============================
                
                0. Exit;
                
                """;



        while (isWorking) {
            System.out.println(instructions);
            System.out.print("Your command is ");
            int command = scanner.nextInt();

            if (command == 0) {
                isWorking = false;
                break;
            }

            if (command == 1) {
                System.out.println("ToDo list: \n");
                System.out.println(toDoList);
            }

            if (command == 2) {
                scanner.nextLine();

                System.out.print("Enter ID of toDo from todoList: ");

                String id = scanner.nextLine();
                System.out.println();
                ToDo toDo = toDoList.getTodo(id);

                System.out.println(toDo);
            }

            if (command == 3) {
                scanner.nextLine();

                System.out.println("You have chosen the \"Add todo\" command");
                System.out.print("Enter the title of new todo: ");
                String title = scanner.nextLine();

                System.out.print("Enter the color of new todo (#FFFFFF): ");
                String color = scanner.nextLine();

                ToDo toDo = new ToDo(title, color);
                toDoList.addTodo(toDo);
            }

        }
    }
}