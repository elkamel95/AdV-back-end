package com.array.permit.Entity.arraysEntities.ccEntities;

import com.array.permit.Entity.arraysEntities.ccEntities.Component;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class ccComponents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long      id;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "comp")
    private List<Component> comp = new ArrayList<Component>();;
}
