package kz.nurbakyt.project5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvFileSource;
public class NumberWorkerTest {
    NumberWorkerTest numberWorker;



    @ParameterizedTest
    @ValueSource(ints = {5, 11, 19, 23,29,31,53})
    public void isPrimeForPrimes(int n){
        Assertions.assertTrue(new NumberWorker().isPrime(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {12, 48, 33})
    public void isPrimeForNotPrimes(int n) throws Exception{
        Assertions.assertFalse(new NumberWorker().isPrime(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {-125, 0, -1332})
    public void isPrimeForIncorrectNumbers(int n) throws Exception{
        Assertions.assertThrows(RuntimeException.class, () -> new NumberWorker().isPrime(n));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void isSumCorrect(int n, int m) throws Exception{
        Assertions.assertEquals(m, new NumberWorker().digitsSum(n));
    }

//    @ParameterizedTest
//    @ValueSource(ints = {-10, 0, 1})
//    public void isPrimeForIncorrectNumbers(int n) throws Exception{
//        Assertions.assertThrows(NumberWorkerTest.IllegalNumberException.class, () -> numberWorker.isPrime(num));
//    }
//
//    @ParameterizedTest
//    @CsvFileSource(resources = {"/data.csv"})
//    void checkDigitsSumTrue(int num, int res) {
//        Assertions.assertEquals(numberWorker.digitsSum(num), res);
//    }
}
