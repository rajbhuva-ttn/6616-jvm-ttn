public class Example3 {


        static void someStaticMethod( int i){
            System.out.println("Hello from JDKFunctionalInterfaceDemo static method::"+i);
        }

        void someNonStaticMethod(int i){
            System.out.println("Hello from JDKFunctionalInterfaceDemo non static method::"+i);
        }



        public static void main(String[] args) throws InterruptedException {


            new Thread(() -> {
                System.out.println("Thread = "+Thread.currentThread().getId());
            }).start();

//            System.out.println("Main Thread ="+Thread.currentThread().getId());


        }
    }

