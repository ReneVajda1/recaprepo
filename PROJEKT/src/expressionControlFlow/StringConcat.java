package expressionControlFlow;

public class StringConcat {
    public static void main(String[] args) {

//        String message = "1 Hello, World! 2";
//
//        message = message.concat(" Have a nice day");
//        System.out.println(message);
//
//        message = message.repeat(2);
//        System.out.println(message);
//
//        message = message.replace('e','X');
//        System.out.println(message);
//
//        message = message.replace('X','e');
//        System.out.println(message);

        String message2 = "123Hello";
        System.out.println(String.valueOf(message2));

        char[] chars = message2.toCharArray();
        for(char i : chars) {
            System.out.print(i);
        }

        char[] chars1 = message2.toCharArray();
        for (char c : chars1) {
            System.out.print(c);
        }

        String str = "Hello";
        char[] chars4 = str.toCharArray();
        for (char c : chars4) {
            System.out.println(c); // Output: H e l l o
        }
    }
}
