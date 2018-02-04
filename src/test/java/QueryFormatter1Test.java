import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by shitingji on 2018/2/5.
 */
public class QueryFormatter1Test {
    @Test
    public void should_transform_param_to_lowercase() {
        String value = QueryFormatter1.format("Something");
        assertEquals("something",value);
    }

    @Test
    public void should_escape_dash() {
        String value = QueryFormatter1.format("Some-thing");
        assertEquals("some\\-thing",value);
    }

    @Test
    public void should_escape_contain_quoted_dash() {
        String value = QueryFormatter1.format("Some\\-thing");
        assertEquals("some\\-thing",value);
    }

    @Test
    public void should_not_change_with_quoted_dash() {
        String value = QueryFormatter1.format("\"Something\"");
        assertEquals("\"Something\"",value);
    }
}
