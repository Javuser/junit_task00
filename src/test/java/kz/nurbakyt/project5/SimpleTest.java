package kz.nurbakyt.project5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SimpleTest {
    @Test
    public void test(){
        int x = 2;
        int y = 5;

        Assert.assertEquals(10, x * y);
        Assert.assertEquals(7, x + y);
    }
}
