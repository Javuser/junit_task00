package kz.nurbakyt.project5;

public class NumberWorker {
    public class IllegalNumberException extends RuntimeException{}
    public boolean isPrime(int n){
        if(n < 1){
            throw new IllegalNumberException();
        }
        int i = 1;
        int cnt = 0;
        boolean ok = false;
        while(i <= n / 2){
            if(n % i == 0){
                cnt++;
            }
            i++;
        }
        if(cnt > 1){
            ok = false;
        }else{
            ok = true;
        }
        return ok;
    }
    public int digitsSum(int n){
        int res = 0;
        while(n != 0){

            res+=(n % 10);
            n/=10;
        }
        return res;
    }

}
