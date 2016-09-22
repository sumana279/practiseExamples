/**
 * Created by svishnu on 6/22/16.
 */
public class AddSolutions {
    public int addDigits(int num) {
        int sum = 0, qut = num;
        while (qut / 10 != 0) {
            while ((qut > 0)) {
                sum = sum + qut % 10;
                qut = qut / 10;
            }
            qut = sum;
            sum = 0;
        }



        return qut;
    }
}
