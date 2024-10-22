package com.tdd.domain.post;

import com.navercorp.fixturemonkey.FixtureMonkey;
import com.navercorp.fixturemonkey.api.introspector.FieldReflectionArbitraryIntrospector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class PostRepositoryTest {
    FixtureMonkey fixtureMonkey = FixtureMonkey.builder()
            .objectIntrospector(FieldReflectionArbitraryIntrospector.INSTANCE)
            .register(Post.class, arbitraryBuilder ->
                    arbitraryBuilder.giveMeBuilder(Post.class)
                            .minSize("id", 0)
                            .set("comments", new ArrayList<>()))
            .build();

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private PostRepository repository;

    private Post post;

    @BeforeEach
    void setUp() {
        post = fixtureMonkey.giveMeOne(Post.class);
    }

    @Test
    void creation() {
        Query query = em.createQuery("select count(p) from Post p");
        Long before = (Long) query.getSingleResult();

        repository.save(post);

        assertEquals(before + 1L, query.getSingleResult());
    }
}