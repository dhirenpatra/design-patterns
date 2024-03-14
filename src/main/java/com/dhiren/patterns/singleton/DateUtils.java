package com.dhiren.patterns.singleton;

import java.io.Serializable;

public class DateUtils implements Serializable, Cloneable {

    private static final long serialVersionUID = 40L;
    private static volatile DateUtils instance;

    public static final String FILE_PATH = "/Users/dhiren/Documents/JavaCodes/design-patterns/src/main/java/com/dhiren/patterns/singleton/dateutil.ser";
    private DateUtils() {}

    public static DateUtils getDateUtilsInstance() {
        if(instance == null) {
            synchronized (DateUtils.class) {
                if (instance == null) {
                    instance = new DateUtils();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    public Object clone() {
        throw new UnsupportedOperationException("Not Supported");
    }
}
