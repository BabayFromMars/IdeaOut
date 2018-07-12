package myPack;

public class Test {
/*    int a,b;

    Test(int i, int j){
        a = i;
        b = j;
    }
    boolean equals(Test o) {
        if (o.a == a && o.b == b)
            return true;
        else return false;
        //++++
    }
        void meth(Test o1){
            o1.a *=2;
            o1.b /=2;
        }

        void meth(int a, int b){
        a *=2;
        b /=2;
        }*/

    int a;

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}
