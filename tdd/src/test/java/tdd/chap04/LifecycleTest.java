package tdd.chap04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LifecycleTest {
    public LifecycleTest() {
        System.out.println("LifecycleTest.LifecycleTest");
    }

    @BeforeEach
    void setUp() {
        System.out.println("LifecycleTest.setUp");
    }

    @Test
    void a () {
        System.out.println("LifecycleTest.a");
    }

    @Test
    void b () {
        System.out.println("LifecycleTest.b");
    }

    @AfterEach
    void tearDown() {
        System.out.println("LifecycleTest.tearDown");
    }
}