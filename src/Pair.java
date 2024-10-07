public class Pair<A, B> {
    private A first;
    private B second;
    public A getFirst() {
        return first;
    }
    public B getSecond() {
        return second;
    }
    public void setFirst(A thing) {
        first = thing;
    }
    public void setSecond(B thing) {
        second = thing;
    }

    public Pair() {
        first = null;
        second = null;
    }



    public static void main(String[] args) {
        //totally a "a solid language to use for application development", one can't even use native types (ie, int) as a generic parameter
        //which will give you the most meaningless error message ever: "Syntax Error: insert "Dimensions" to complete expression/referencetype."
        Pair<Integer, Integer> intPair = new Pair<Integer, Integer>();
        Pair<Double, String> mixPair = new Pair<Double, String>();
        Pair<Pair<Integer, Integer>, Pair<Double, String>> pairPair = new Pair<Pair<Integer, Integer>, Pair<Double, String>>();
	}
}


