package com.array.permit.Entity.arraysEntities.ccEntities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Component {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long      id;
    private boolean   mapFromUserInput ;
    private String    imgSegment ;
    private String  TypeSegment ;
    private String    conductorType;
    private String    conductorSize;
    private String    conduitType;
    private String    conduitSize;
    private String    qtySegment;
    private String    componentOrder;
    private Boolean   conductorTypeExisting;
    private Boolean   conductorSizeExisting;
    private Boolean   conduitTypeExisting;
    private Boolean   conduitSizeExisting;
    private String    conductorNeutral;

}
