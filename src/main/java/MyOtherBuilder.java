/**
 * Created by lisner on 10/7/2015.
 */
// public class MyOtherBuilder <T extends MyOtherBuilder> {}
public class MyOtherBuilder extends MyBuilder<MyOtherBuilder> {
    private String string3;

    /*
    protected final T _this() {
        return (T) this;
    }
    */

    /*
    public MyOtherBuilder setString3(String _inString) {
        string3 = _inString;
        return _this();
    }
    */

    public MyOtherBuilder setString3(String _inString) {
        string3 = _inString;
        return this;
    }

    public String get() {
        return string1 + " ... " + string2 + " ... " + string3;
    }
}
