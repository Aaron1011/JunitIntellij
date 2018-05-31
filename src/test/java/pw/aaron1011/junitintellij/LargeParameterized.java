package pw.aaron1011.junitintellij;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

@RunWith(Parameterized.class)
public class LargeParameterized {

    @Parameterized.Parameters
    public static Object[] data() {
        return new Object[100000];
    }

    public LargeParameterized(Object data) {

    }

    @Test
    public void test() {
    }

}
