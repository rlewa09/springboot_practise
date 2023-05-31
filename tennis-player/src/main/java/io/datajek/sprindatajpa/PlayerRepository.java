package io.datajek.sprindatajpa;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class PlayerRepository {
    @PersistenceContext
    EntityManager entityManager;
}
