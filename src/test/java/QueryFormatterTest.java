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
}
