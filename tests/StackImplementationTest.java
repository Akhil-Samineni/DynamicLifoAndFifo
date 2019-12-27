import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackImplementationTest {
    Utility utility=new Utility();
    StackImplementation stackImplementation=new StackImplementation(utility);


    @Test
    void add() {
        assertTrue(stackImplementation.isEmpty());
        stackImplementation.add(1);
        assertEquals(1,stackImplementation.get());
        stackImplementation.add(2);
        stackImplementation.add(3);
        assertEquals(3,stackImplementation.get());
        stackImplementation.add(4);
        stackImplementation.add(5);
        stackImplementation.add(6);
        stackImplementation.add(7);
        assertEquals(5,stackImplementation.size());
    }

    @Test
    void get() {
        assertEquals(-1,stackImplementation.get());
        assertEquals(0,stackImplementation.size());
        stackImplementation.add(1);
        assertEquals(1,stackImplementation.get());
        assertEquals(-1,stackImplementation.get());
        stackImplementation.add(0);
        stackImplementation.add(0);
        assertEquals(0,stackImplementation.get());
        assertEquals(1,stackImplementation.size());
        assertEquals(0,stackImplementation.get());
        assertEquals(0,stackImplementation.size());

    }

    @Test
    void increaseOrDecrease() {
        assertEquals(0,stackImplementation.size());
        stackImplementation.add(1);
        stackImplementation.add(2);
        stackImplementation.add(3);
        stackImplementation.add(4);
        assertEquals(4,stackImplementation.arraySize());
        stackImplementation.add(5);
        assertEquals(8,stackImplementation.arraySize());
        stackImplementation.add(6);
        assertEquals(stackImplementation.size(),6);
        stackImplementation.get();
        stackImplementation.get();
        stackImplementation.get();
        stackImplementation.get();
        assertEquals(4,stackImplementation.arraySize());


    }

    @Test
    void isEmpty() {

        assertTrue(stackImplementation.isEmpty());
        stackImplementation.add(1);
        assertFalse(stackImplementation.isEmpty());
        stackImplementation.add(1);
        stackImplementation.add(1);
        stackImplementation.get();
        stackImplementation.get();
        assertFalse(stackImplementation.isEmpty(),"yes");
        stackImplementation.get();
        assertTrue(stackImplementation.isEmpty(),"yes");
    }

    @Test
    void size() {
        assertEquals(0,stackImplementation.size());
        stackImplementation.add(1);
        stackImplementation.add(1);
        assertEquals(2,stackImplementation.size());
        stackImplementation.get();
        assertEquals(1,stackImplementation.size());
    }
}