/**
 * Created by shitingji on 2018/2/2.
 */
public class QueryFormatter {
    public static String format(String something) {
        if (something.startsWith("\"") && something.endsWith("\"")) {
            return something;
        }
        return something.toLowerCase()
                .replace("-", "\\-")
                .replace("\\\\", "\\");
    }
}
