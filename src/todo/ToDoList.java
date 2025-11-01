package todo;

import java.util.Objects;

public class ToDoList implements IToDoList {
    private ToDo[] todos;

    public ToDoList(ToDo[] todos) {
       this.todos = todos;
    }

    public ToDo[] getTodos() {
        return this.todos;
    }

    public void setTodos(ToDo[] todos) {
        this.todos = todos;
    }

    @Override
    public ToDo addTodo(ToDo todo) {
        for (int i = 0; i < this.todos.length; i++) {
            if (this.todos[i] == null) {
                this.todos[i] = todo;
                return todo;
            }

            if (i == this.todos.length - 1) return null;
        }

        return null;
    }

    @Override
    public boolean deleteTodo(String id) {
        for (int i = 0; i < this.todos.length; i ++) {
            if (Objects.equals(this.todos[i].getId(), id)) {
                this.todos[i] = null;

                return true;
            };
        }

        return false;
    }

    @Override
    public boolean editTodo(ToDo todo) {
        ToDo todoItem = getTodo(todo.getId());

        if (todoItem == null) return false;

        todoItem.setTitle(todo.getTitle());
        todoItem.setColor(todo.getColor());
        todoItem.setCompleted(todo.isCompleted());

        return true;
    }


    @Override
    public ToDo getTodo(String id) {
        for (ToDo todoItem: this.todos) {
            if (Objects.equals(todoItem.getId(), id)) return  todoItem;
        }

        return null;
    }

    @Override
    public String toString() {
        String todosString = "";

        for (ToDo todoItem: this.todos) {
            if (todoItem != null) {
                todosString += todoItem.toString() + "\n";
            }
        }

        return todosString.isEmpty() ? "ToDo list is empty" : todosString;
    }
}
