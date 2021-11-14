public class SpeedTest {
    public static void main(String[] args) {
        // Task 22.3.1
        StringBuilder sb = new StringBuilder();
        sb.append("abc");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            sb.reverse();
        }
        System.out.println((System.currentTimeMillis() - startTime));
        // append, 50000 - 0
        // append, 200000 - 15
        // append, 1000000 - 16

        // delete(0, 10), 50000 - 0
        // delete(0, 10), 200000 - 0
        // delete(0, 10), 1000000 - 2

        // insert(0, аргумент), 50000 - 369
        // insert(0, аргумент), 200000 - 5771
        // insert(0, аргумент), 1000000 - 369 - >min

        // insert(length()/2, аргумент), 50000 - 172
        // insert(length()/2, аргумент), 200000 - 2863
        // insert(length()/2, аргумент), 1000000 - >min

        // setCharAt(int index, char c), 50000 - 0
        // setCharAt(int index, char c), 200000 - 0
        // setCharAt(int index, char c), 1000000 - 0

        // reverse(), 50000 - 0
        // reverse(), 200000 - 0
        // reverse(), 1000000 - 15

    }
}
