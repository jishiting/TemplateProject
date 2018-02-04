import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by shitingji on 2018/2/5.
 */
public class QueryFormatterTest1 {
    @Test
    public void should_transform_param_to_lowercase() {
        String value = QueryFormatter1.format("Something");
        assertEquals("something",value);
    }
}
