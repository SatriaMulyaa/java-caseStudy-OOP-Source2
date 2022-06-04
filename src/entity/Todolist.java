package entity;

public class Todolist {
    private String todo;

    // constructor
    public Todolist(){}

    public Todolist(String todo){
        this.todo = todo;
    }

    // getter
    public String getTodo(){
        return todo;
    }

    // setter
    public void setTodo(String todo){
        this.todo = todo;
    }
}
