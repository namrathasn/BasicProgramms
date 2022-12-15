public class FlipCoin {
    public static void main(String[] args) {

        System.out.println("Welocome to basic programs");
        {
            int n = 10;
            int head = 0, tail = 0;
            for (int i = 1; i <= n; i++) {
                //generating random numbers between 0 to 1
                double random = Math.floor(Math.random() * 10) % 2;
                //checking the is it head or tail
                if (random < 0.5) {
                    head++;
                    System.out.println("Heads" + head);
                } else {
                    tail++;
                    System.out.println("Tails" + tail);
                }
            }
            //printing the number of percentage head and tail gets
            System.out.println("Percentage of head is " + head);
            System.out.println("Percentage of tail is " + tail);
        }

    }
}


