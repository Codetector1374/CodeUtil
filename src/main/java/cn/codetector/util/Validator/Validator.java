package cn.codetector.util.Validator;

/**
 * Created by codetector on 16/8/10.
 */
public class Validator {
    public static void notNull(Object o){
        if (o == null){
            throw new IllegalArgumentException("A Nullptr passed into a not null parameter");
        }
    }
}
