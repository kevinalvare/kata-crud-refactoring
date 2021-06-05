package co.com.sofka.crud.services;

import co.com.sofka.crud.entity.ListTodo;
import co.com.sofka.crud.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListService {
    @Autowired
    private ListRepository repositoryMayor;

    public Iterable<ListTodo> list(){
        return repositoryMayor.findAll();
    }

    public ListTodo save(ListTodo mayorList){
        return repositoryMayor.save(mayorList);
    }

    public void delete(Long id){
        repositoryMayor.delete(get(id));
    }

    public ListTodo get(Long id){
        return repositoryMayor.findById(id).orElseThrow();
    }
}
