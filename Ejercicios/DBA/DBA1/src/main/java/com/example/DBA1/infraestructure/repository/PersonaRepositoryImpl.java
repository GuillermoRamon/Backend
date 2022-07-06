package com.example.DBA1.infraestructure.repository;

import com.example.DBA1.domain.Persona;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class PersonaRepositoryImpl {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Persona> getData(HashMap<String, Object> conditions){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Persona> query= cb.createQuery(Persona.class);
        Root<Persona> root = query.from(Persona.class);

        List<Predicate> predicates = new ArrayList<>();
        conditions.forEach((field,value) -> {
            switch (field) {
                case "idPersona":
                    predicates.add(cb.equal(root.get(field), (Integer) value));
                    break;
                case "usuario":
                    predicates.add(cb.like(root.get(field),"%"+(String)value+"%"));
                    break;
                case "name":
                    predicates.add(cb.like(root.get(field),"%"+(String)value+"%"));
                    break;
                case "surname":
                    predicates.add(cb.like(root.get(field),"%"+(String)value+"%"));
                    break;
                case "createDate":
                    String dateCondition=(String) conditions.get("dateCondition");
                    switch (dateCondition)
                    {
                        case "GREATER_THAN":
                            predicates.add(cb.greaterThan(root.<Date>get(field),(Date)value));
                            break;
                        case "LESS_THAN":
                            predicates.add(cb.lessThan(root.<Date>get(field),(Date)value));
                            break;
                        case "EQUAL":
                            predicates.add(cb.equal(root.<Date>get(field),(Date)value));
                            break;
                    }
                    break;
            }
        });
        String order = (String) conditions.get("order");
        switch (order){
            case "usuario":
                query.select(root).where(predicates.toArray(new Predicate[predicates.size()])).orderBy(cb.asc(root.get("usuario")));
            case "name":
                query.select(root).where(predicates.toArray(new Predicate[predicates.size()])).orderBy(cb.asc(root.get("name")));
            case "default":
                query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));
        }
        return entityManager.createQuery(query).getResultList();
    }

}
