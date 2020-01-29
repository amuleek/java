class NoArgCtor {

    int i;

    // constructor with no parameter
    private NoArgCtor(){
        i = 5;
        System.out.println("Object created and i = " + i);
    }

    public static void main(String[] args) {
        NoArgCtor obj = new NoArgCtor();
    }
}
