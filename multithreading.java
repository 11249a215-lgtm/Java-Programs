public class MultithreadingDemo {
    public static void main(String[] args) {
        // a) Food Delivery App threads
        Thread orderPlacement = new Thread(() -> System.out.println("Order Placed successfully."));
        Thread orderDelivery = new Thread(() -> System.out.println("Order Out for Delivery."));
        orderPlacement.start();
        orderDelivery.start();

        // b) Task manager counter
        Thread counter = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Count: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) { e.printStackTrace(); }
        });
        counter.start();

        // c) Payment gateway using Runnable
        Runnable paymentTask = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Payment Processing...");
            }
        };
        new Thread(paymentTask).start();
    }
}