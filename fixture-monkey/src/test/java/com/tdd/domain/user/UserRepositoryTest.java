package com.tdd.domain.user;

import com.navercorp.fixturemonkey.FixtureMonkey;
import com.navercorp.fixturemonkey.api.arbitrary.MonkeyStringArbitrary;
import com.navercorp.fixturemonkey.api.introspector.FieldReflectionArbitraryIntrospector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class UserRepositoryTest {
    FixtureMonkey fixtureMonkey = FixtureMonkey.builder()
            .objectIntrospector(FieldReflectionArbitraryIntrospector.INSTANCE)
            .register(User.class, arbitraryBuilder ->
                    arbitraryBuilder.giveMeBuilder(String.class)
                            .set("firstName", new MonkeyStringArbitrary().alpha())
                            .set("lastName", new MonkeyStringArbitrary().alpha())
            )
            .build();

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private UserRepository repository;

    private User firstUser;
    private User secondUser;
    private User thirdUser;
    private User fourthUser;
    private User fifthUser;

    @BeforeEach
    void setUp() {
        firstUser = fixtureMonkey.giveMeOne(User.class);
        secondUser = fixtureMonkey.giveMeOne(User.class);
        thirdUser = fixtureMonkey.giveMeOne(User.class);
        fourthUser = fixtureMonkey.giveMeOne(User.class);
        fifthUser = fixtureMonkey.giveMeOne(User.class);
    }

    @Test
    void creation() {
        Query query = em.createQuery("select count(u) from User u");
        Long before = (Long) query.getSingleResult();
        List<User> users = List.of(firstUser, secondUser, thirdUser, fourthUser, fifthUser);

        repository.saveAll(users);

        assertEquals(before + 5L, query.getSingleResult());
    }
}