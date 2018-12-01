package com.aurea.nauua.paramcheck;

import java.util.Objects;
import javax.annotation.Generated;
import org.junit.Test;

@Generated("GeneralPatterns")
public class Assignment2PatternTest {

    @Test(expected = IllegalArgumentException.class)
    public void method1NullParameter() {
        Assignment2 entity = new Assignment2();
        entity.method1(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void method2NullParameter() {
        Assignment2 entity = new Assignment2();
        entity.method2(null, null);
    }
}
