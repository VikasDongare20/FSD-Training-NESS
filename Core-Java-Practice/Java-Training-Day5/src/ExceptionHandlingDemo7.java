


public class ExceptionHandlingDemo7 {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        int c;

        try{
            c = a /b;
            System.out.println(" "+c);
        }
        catch (ArithmeticException e){

        }
        catch (NullPointerException | NumberFormatException e){

        }
        catch (Exception e){

        }

    }
}
