
public class Review02 {

    public static void main(String[] args) {

        // iの値を1から100までの間、処理を繰り返す
        for (int i = 1; i <= 100; i++) {

            // iの値が3で割り切れ、かつ、5で割り切れる
            if ((i % 3 == 0) && (i % 5 == 0)) {
                // "FizzBuzz"を表示する
                System.out.println("FizzBuzz");
            // iの値が3で割り切れる
            } else if (i % 3 == 0) {
                // "Fizz"を表示する
                System.out.println("Fizz");
            // iの値が5で割り切れる
            } else if (i % 5 == 0) {
                // "Buzz"を表示する
                System.out.println("Buzz");
            } else {
                // iの値を表示する
                System.out.println(i);
            }

        }

    }

}
