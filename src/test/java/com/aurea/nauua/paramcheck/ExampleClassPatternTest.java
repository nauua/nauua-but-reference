package com.aurea.nauua.paramcheck;

import java.util.Objects;
import javax.annotation.Generated;
import org.junit.Test;

@Generated("GeneralPatterns")
public class ExampleClassPatternTest {

    @Test(expected = NullPointerException.class)
    public void assignNewValueNullParameter() throws Exception {
        ExampleClass entity = new ExampleClass();
        entity.assignNewValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void assignNewValue2NullParameter() throws Exception {
        ExampleClass entity = new ExampleClass();
        entity.assignNewValue2(null);
    }
}
