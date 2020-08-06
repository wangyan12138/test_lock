import org.openjdk.jol.info.ClassLayout;

/**
 * @Author
 * @Date 2020/7/28
 * @since 1.0
 */
public class T01 {
    public static void main(String[] args) {
        Object o = new Object();
        o.hashCode();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        synchronized(o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
