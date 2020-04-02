package com.colorpix.rest.webservices.restfulwebservices.todo;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList();
    private static int counter =0;
    static{
        todos.add(new Todo(++counter,"admin","Vacation Pictures", new Date(),false));
        todos.add(new Todo(++counter,"admin","Marriage Pictures", new Date(),false));
        todos.add(new Todo(++counter,"admin","Party Pictures", new Date(),false));


    }

    public List<Todo> findAll(){
        return todos;
    }


}
