package todo;

public interface IToDoList {
    public void addTodo();
    public void deleteTodo();
    public void editTodo();
    public ToDo getTodo(String id);
}
