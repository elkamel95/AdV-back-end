package com.array.permit.Repository;

import com.array.permit.Entity.arraysEntities.StringField;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StringRepository extends JpaRepository<StringField,Long> {
}
