import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by shitingji on 2018/2/2.
 */
public class QueryFormatterTest {


    @Test
    public void should_transform_input_info_to_lowercase() {
        String actualValue = QueryFormatter.format("Something");
        String expectedValue = "something";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void should_escape_dash() {
        String actualValue = QueryFormatter.format("Some-thing");
        String expectedValue = "some\\-thing";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void should_escape_multiple_dash() {
        String actualValue = QueryFormatter.format("Some\\-ting\\-no");
        String expectedValue = "some\\-ting\\-no";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void should_not_change_with_quoted_dash() {
        String actualValue = QueryFormatter.format("\"Some-thing\"");
        String expectedValue = "\"Some-thing\"";
        assertEquals(expectedValue, actualValue);
    }
}
