package guru.springframework.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class NotesTest {
    @BeforeEach
    void before() {
        System.out.println("before NotesTest junit5");
    }

    @Test
    void test() {
        assertEquals(1, 1, "1=1");
    }

}