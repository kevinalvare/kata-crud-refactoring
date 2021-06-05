package co.com.sofka.crud.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table( name = "listTodo")
public class ListTodo {
    @Id
    @GeneratedValue

    private Long id;
    private String groupname;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "identity")

    private Set<Todo> todo;

    public Set<Todo> getTodo() {
        return todo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
}
