import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ExceptionHandling {

    static  class  AgeException extends  RuntimeException{
        public  AgeException(String message){
            super(message);
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int arr[]= {1,2,4,54};
        String str = null;
        int age = -1;
       
       
       
        try {
            
            // if(age<0){
            //     throw new AgeException("age can not be newgative");
            // }
       
            // System.out.println(str.length());
            // System.out.println(arr[4]);
            // System.out.println(a/0);
            Map<String,List<Integer>> User =  new HashMap<>();
            User.put("Chirag",Arrays.asList(20,21));
            User.put("Rahul",Arrays.asList(22,23));
            System.out.println(User.get("Chirag"));
            System.out.println(User.get("Rahul"));


        } catch (ArithmeticException e) {
            System.out.println("Arithmatic eception aa gya hai _____." + e);
        }catch(NullPointerException e){
            System.out.println(" null pointer aa gya hai");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("index out of bound" +e);
        }finally{
            System.out.println(
                "Program ended successfully"
            );
        }
      
    }
}
