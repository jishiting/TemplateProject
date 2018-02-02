import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by shitingji on 2018/2/2.
 */
public class QueryFormatterTest {
    @Test
    public void should_transform_param_value_to_lowercase() {
        String value =QueryFormatter.format("Something");
        assertEquals("something",value);
    }

    @Test
    public void should_escape_dash() {
        String value = QueryFormatter.format("Some-thing");
        assertEquals("some\\-thing",value);
    }

    @Test
    public void should_escape_double_dash() {
        String value = QueryFormatter.format("Some\\-ting");
        assertEquals("some\\-ting",value);
    }
}
