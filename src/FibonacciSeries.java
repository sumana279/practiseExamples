/**
 * Created by svishnu on 7/22/16.
 */
public class FibonacciSeries {

    int a=0,b=1,c=0;
    public void fibNum(int n){
    if(n==1 ) {
        System.out.println(" The fibonacci output is "+ n);
    }else if(n==0){
            System.out.println(" The fibonacci output is "+ n);
    }
        else{
            for (int i = 0; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        System.out.println(" The fibonacci output is "+ c);

    }
  }

}
