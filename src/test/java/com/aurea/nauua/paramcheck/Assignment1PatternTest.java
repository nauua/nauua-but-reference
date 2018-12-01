package com.aurea.nauua.paramcheck;

import java.util.Objects;
import javax.annotation.Generated;
import org.junit.Test;

@Generated("GeneralPatterns")
public class Assignment1PatternTest {

    @Test(expected = NullPointerException.class)
    public void method1NullParameter() throws Exception {
        Assignment1 entity = new Assignment1();
        entity.method1(null);
    }

    @Test(expected = NullPointerException.class)
    public void method2NullParameter() throws Exception {
        Assignment1.method2(null);
    }

    @Test(expected = NullPointerException.class)
    public void method1WithTwoArgumentsNullParameter() throws Exception {
        Assignment1 entity = new Assignment1();
        entity.method1(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void method2WithTwoArgumentsNullParameter() throws Exception {
        Assignment1.method2(null, null);
    }
}
