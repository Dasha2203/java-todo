package todo;

public interface IToDoList {
    public ToDo addTodo(ToDo todo);
    public boolean deleteTodo(String id);
    public boolean editTodo(ToDo todo);
    public ToDo getTodo(String id);
}
