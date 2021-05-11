public class Cycle {
    public void play() {
        System.out.println("Cycle");
        public int wheels() {
                return 0;
            }
        }

        public class Unicycle extends Cycle {
            public int wheels() {
                return 1;
            }
        }

        public class Bicycle extends Cycle {
            public int wheels() {
                return 2;
            }
        }

        public class Tricycle extends Cycle {
            public int wheels() {
                return 3;
            }
        }

        public class E01_Upcasting {
            public void ride(Cycle c) {
                System.out.println("车轮子数为：" + c.wheels());
            }


        }
    }


