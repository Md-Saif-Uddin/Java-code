package Junit.Test;

import Junit.Grader;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraderTest {

    @Test
    public void testLessZero(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
//                () -> { grader.Result(5); // this will throw illegal argument expression
                () -> { grader.Result(-1);
        });
    }


    @Test
    public void fiftyReturnF(){
        var grader = new Grader();
        assertEquals('F',grader.Result(50));
    }

    @Test
    public void sixtyReturnF(){
        var grader = new Grader();
        assertEquals('D',grader.Result(60));
    }

    @Test
    public void seventyReturnF(){
        var grader = new Grader();
        assertEquals('C',grader.Result(70));
    }

    @Test
    public void eightyReturnF(){
        var grader = new Grader();
        assertEquals('B',grader.Result(80));
    }

    @Test
    public void nintyReturnF(){
        var grader = new Grader();
        assertEquals('A',grader.Result(90));
    }

    @Test
    public void hundredOneThrows(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
//                () -> { grader.Result(5); // this will throw illegal argument expression
                () -> { grader.Result(101);
                });
    }
}