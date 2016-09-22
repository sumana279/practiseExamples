/**
 * Created by svishnu on 6/22/16.
 */
public class HappySolution {
    Boolean flag = false;
    public boolean isHappy(int n) {
        int sum = 0, qut = n;
        while (qut / 10 != 0) {
            while ((qut > 0)) {
                sum = sum + ((qut % 10) * (qut % 10));
                qut = qut / 10;
            }
            qut = sum;
            sum = 0;
        }

        if(qut == 1||qut == 7){
            return flag=true;
        }

        return flag;
    }
}
