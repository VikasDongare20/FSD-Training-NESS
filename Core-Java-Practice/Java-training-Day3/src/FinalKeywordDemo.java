class FinalDemo{
    int a =10;
    final int b;

    public FinalDemo(){
        b = 20;
    }


    public void changeVariable(int a){
        this.a = a;
    }

    public void changeVariableFinal(int b){
        //this.b = b;
    }

    public void parentNotFinalMethod(){
        System.out.println("Parent non final method");
    }

    public final void parentFinalMethod(){
        System.out.println("Parent final method");
    }
}

class FinalChildDemo extends FinalDemo{
    @Override
    public void parentNotFinalMethod() {
        System.out.println("child non final method");
    }


}


public class FinalKeywordDemo {
    public static void main(String[] args) {

    }
}