public class AnotherTestClass {

    private int numTest;

    public AnotherTestClass(int numTest) {
        this.numTest = numTest;
    }

    public int getNumTest() {
        return numTest;
    }

    public void setNumTest(int numTest) {
        this.numTest = numTest;
    }

    @Override
    public String toString() {
        return "AnotherTestClass{" +
                "numTest=" + numTest +
                '}';
    }
}
