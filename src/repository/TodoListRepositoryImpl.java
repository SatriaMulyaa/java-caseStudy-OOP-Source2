package repository;

import entity.Todolist;

public class TodoListRepositoryImpl implements TodoListRepository {
   public Todolist[] data = new Todolist[10];


    @Override
    public Todolist[] getAll() {
        return data;
    }

    public boolean isFull(){
     var isFull = true;
     for (int i = 0; i <data.length ; i++) {
      if(data[i] == null){
       isFull = false;
       break;
      }
     }
     return isFull;
    }

    public void resizeIsFull(){
     // if full we resize the size to be 2X
     if(isFull()){
      var temp = data;
      data = new Todolist[data.length * 2];

      for (int i = 0; i < temp.length ; i++) {
       data[i] = temp[i];
      }
     }
    }

    @Override
    public void add(Todolist todolist) {
     resizeIsFull();
     // add in position data Array null
     for (int i = 0; i < data.length ; i++) {
      if(data[i] == null){
       data[i] = todolist;
       break;
      }
     }
    }

    @Override
    public void remove(Integer number) {

    }


}
