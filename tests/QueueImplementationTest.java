import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueImplementationTest {
    Utility utility=new Utility();
    QueueImplementation queueImplementation=new QueueImplementation(utility);

    @Test
    void add() {
        assertTrue(queueImplementation.isEmpty());
        queueImplementation.add(1);
        assertEquals(1,queueImplementation.get());
        queueImplementation.add(2);
        queueImplementation.add(3);
        assertEquals(2,queueImplementation.get());
        queueImplementation.add(4);
        queueImplementation.add(5);
        queueImplementation.add(6);
        queueImplementation.add(7);
        assertEquals(5,queueImplementation.size());
    }

    @Test
    void get() {
        assertEquals(-1,queueImplementation.get());
        assertEquals(0,queueImplementation.size());
        queueImplementation.add(1);
        assertEquals(1,queueImplementation.get());
        assertEquals(-1,queueImplementation.get());
        queueImplementation.add(2);
        queueImplementation.add(3);
        assertEquals(2,queueImplementation.get());
        assertEquals(1,queueImplementation.size());
        assertEquals(3,queueImplementation.get());
        assertEquals(0,queueImplementation.size());

    }

    @Test
    void increaseOrDecrease() {
        assertEquals(0,queueImplementation.size());
        queueImplementation.add(1);
        queueImplementation.add(2);
        queueImplementation.add(3);
        queueImplementation.add(4);
        assertEquals(4,queueImplementation.arraySize());
        queueImplementation.add(5);
        assertEquals(8,queueImplementation.arraySize());
        queueImplementation.add(6);
        assertEquals(queueImplementation.size(),6);
        queueImplementation.get();
        queueImplementation.get();
        queueImplementation.get();
        queueImplementation.get();
        assertEquals(4,queueImplementation.arraySize());


    }

    @Test
    void isEmpty() {
        assertTrue(queueImplementation.isEmpty());
        queueImplementation.add(1);
        assertFalse(queueImplementation.isEmpty());
        queueImplementation.add(1);
        queueImplementation.add(1);
        queueImplementation.get();
        queueImplementation.get();
        assertFalse(queueImplementation.isEmpty(),"yes");
        queueImplementation.get();
        assertTrue(queueImplementation.isEmpty(),"yes");
    }

    @Test
    void size() {
        assertEquals(0,queueImplementation.size());
        queueImplementation.add(1);
        queueImplementation.add(1);
        assertEquals(2,queueImplementation.size());
        queueImplementation.get();
        assertEquals(1,queueImplementation.size());
    }
}