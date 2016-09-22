public class StringReverse {

    public static void main(String[] args) {
        String msg = "Hello World";
        StringBuffer output = new StringBuffer();
        char[] test= msg.toCharArray();
        for(int i=test.length-1;i>=0;i--) {
                output = output.append(test[i]);
        }
        System.out.println(output.toString());

    }
}
