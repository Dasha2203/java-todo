public class ToDo {
    private String title;
    private boolean isCompleted;
    private String color;

    public ToDo(String title) {
        this.title = title;
        this.color = "";
        this.isCompleted = false;
    }

    public ToDo(String title, boolean isCompleted, String color) {
        this.title = title;
        this.isCompleted = isCompleted;
        this.color = color;
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

}
