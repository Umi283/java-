package myStack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    MyStack<Integer> stack;

    @BeforeEach
    void creat(){
        stack = new MyStack<Integer>();
    }

    @AfterEach
    void clear(){
        stack = null;
    }

    @Test
    void EmptyTest(){
        assertThrows(MyStackEmptyException.class,()->{
            stack.pop();
        });
    }

    @Test
    void pushTest(){
        stack.push(Integer.valueOf(1));
        assertEquals(Integer.valueOf(1),stack.top());
        stack.push(Integer.valueOf(2));
        assertEquals(Integer.valueOf(2),stack.top());
    }

    @Test
    void popTest(){
        stack.push(Integer.valueOf(1));
        stack.push(Integer.valueOf(2));
        assertEquals(Integer.valueOf(2),stack.pop());
        stack.push(Integer.valueOf(3));
        assertEquals(Integer.valueOf(3),stack.pop());
        assertEquals(Integer.valueOf(1),stack.pop());
    }

    @Test
    void sizeTest(){
        assertTrue(stack.isEmpty());
        assertEquals(0,stack.size());
        stack.push(Integer.valueOf(1));
        assertFalse(stack.isEmpty());
        assertEquals(1,stack.size());
    }
}