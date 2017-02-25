package ua.goodnews.model;

import javax.persistence.*;
import java.util.Comparator;

/**
 * Created by acidum on 2/9/17.
 */

@Entity
public class Category implements Comparable<Category>{
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Filter filter;

    public Category() {
    }

    public Category(String name, Filter filter) {
        this.name = name;
        this.filter = filter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public int compareTo(Category o) {
        return this.getId().compareTo(o.getId());
    }
}