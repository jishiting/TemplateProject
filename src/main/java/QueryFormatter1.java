/**
 * Created by shitingji on 2018/2/5.
 */
public class QueryFormatter1 {
    public static String format(String value) {
        if(value.startsWith("\"")&&value.endsWith("\"")) return value;
        return value.toLowerCase()
                .replace("-","\\-")
                .replace("\\-","\\-");
    }
}
