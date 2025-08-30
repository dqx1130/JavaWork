public class example01{
    public static void main(String[] args){
        try{
            Integer.parseInt("abc");
        } catch (Exception  e){    // 捕获 try 块中可能发生的任何类型的异常，并将异常对象赋值给变量 e
            System.out.println("caught");
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally");
        }
    }
}
