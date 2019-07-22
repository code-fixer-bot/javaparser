public class Issue300 {

    class A {
        int i;
        private A() {
        }

    }

    class B {
        B() {
            new A().i = 0;
        }
    }
}
