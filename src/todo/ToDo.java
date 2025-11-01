package todo;

import java.util.UUID;

public class ToDo {
    private String id;
    private String title;
    private boolean isCompleted;
    private String color;

    public ToDo(String title) {
        this.title = title;
        this.color = "";
        this.isCompleted = false;
        generateUUID();
    }

    public ToDo(String title, boolean isCompleted, String color) {
        this.title = title;
        this.isCompleted = isCompleted;
        this.color = color;
        generateUUID();
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void toggleCompleted() {
        this.isCompleted = !this.isCompleted;
    }

    private void generateUUID() {
        this.id = UUID.randomUUID().toString();
    }
}
