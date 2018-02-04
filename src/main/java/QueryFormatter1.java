/**
 * Created by shitingji on 2018/2/5.
 */
public class QueryFormatter1 {
    public static String format(String something) {
        if(something.startsWith("\"")&&something.endsWith("\"")) return something;
        return something.toLowerCase().replace("-","\\-").replace("\\-","\\-");
    }
}
