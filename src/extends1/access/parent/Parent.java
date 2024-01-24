package extends1.access.parent;

public class Parent {
    public int publicValue;
    int defaultValue;
    private int privateValue;
    protected int protectedValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }
    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }
    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }
    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }

    public void printParent() {
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);
        System.out.println("protectedValue = " + protectedValue);

        // 부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
        protectedMethod();
        publicMethod();
    }

}
