package abstractclass;

abstract public class DummyAbstractClass {
    String pat;

    DummyAbstractClass(String pat) {
        this.pat = pat;
        System.out.println("THE PAT IS " + this.pat);
    }
}
