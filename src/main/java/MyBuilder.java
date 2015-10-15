/**
 * Created by lisner on 10/7/2015.
 */
public abstract class MyBuilder<B extends MyBuilder<B>> {
    protected String string1;
    protected String string2;

    public B setString1(String _inStr) {
        string1 = _inStr;
        return _this();
    }

    public B setString2(String _inStr) {
        string2 = _inStr;
        return _this();
    }

    public String get() {
        return string1 + string2;
    }

    @SuppressWarnings("unchecked")
    protected B _this() {
        return (B) this;
    }

    public static void main(String[] _args) {
        MyBuilder aBuilder = new MyOtherBuilder();
        String outString = aBuilder
            .setString1("FirstString")
            .setString2("SecondString")
            .get();
        System.out.println(outString);

        MyOtherBuilder otherBuilder = new MyOtherBuilder();
        // Note that even after you call setString3 it returns a MyOtherBuilder
        // BUT you call .setString1 on it, which returns B extends MyBuilder<B>
        // otherBuilder.setString3("3").setString1("1").setString2("2");
        System.out.println(otherBuilder.setString3("3").get());
        otherBuilder
            .setString1("1")
            .setString2("2")
            .setString3("3")
            .get();
    }
}
