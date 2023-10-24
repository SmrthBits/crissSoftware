package bitsoop.lambdas_codes.lambdas;

interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}

class Test
{
    public static void main(String args[])
    {

        FuncInterface funcInterface = new FuncInterface() {
            @Override
            public void abstractFun(int x) {
                System.out.println(2*x);
            }
        };
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x)->System.out.println(2*x);

        // This calls above lambda expression and prints 10.
        funcInterface.abstractFun(5);
        fobj.abstractFun(5);
        fobj.normalFun();

    }
}
