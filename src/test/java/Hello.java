import java.util.Arrays;

public class Hello {

    public static String hello() {
        return "Hello!";
    }
        public static String helloAge(int age){
            if (age <= 0)
            throw new IllegalArgumentException();
            return String.format("Hello, %d!", age);
        }

        public static void test(){
        Arrays.stream(new int[]{1,2,3,4,6}).forEach(i -> System.out.println(i));
        }
    }

