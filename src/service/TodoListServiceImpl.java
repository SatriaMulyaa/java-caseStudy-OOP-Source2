package service;

import entity.Todolist;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository){
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList(){
        System.out.println("TODOLIST");
        Todolist[] model = todoListRepository.getAll();

        for (int i = 0; i <model.length ; i++) {
            var todoList = model[i];
            var no = i + 1;
            if(todoList != null){
                System.out.println(no + ". " + todoList.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo){}

    @Override
    public void removeTodoList(Integer number){}
}
