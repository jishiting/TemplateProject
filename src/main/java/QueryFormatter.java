/**
 * Created by shitingji on 2018/2/2.
 */
public class QueryFormatter {
    public static String format(String something) {
        return something.toLowerCase().replace("-","\\-");
    }
}
