/**
 * File      : ExceptionOnArray.java
 * Deskripsi : Program untuk menunjukan asersi
 */

 public class ExceptionOnArray{
    public static void main(String[] args){
        //intansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger [2] = 11;
            arrayInteger [4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}