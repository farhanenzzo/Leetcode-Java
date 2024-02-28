package LinkedListImplementation;

public class Train {

    public static void  display(Bogi head) {

        while (head.porerBogi != null) {

            System.out.println(head.porerBogi.name);
            head = head.porerBogi;
        }
    }

//    public static Bogi reverseLinkedList(Bogi head) {
//        Bogi prev = null;
//        Bogi next = null;
//        Bogi current = head;
//
//        while(current != null) {
//            next = current.porerBogi;
//            current.porerBogi = prev;
//            prev = current;
//            current = next;
//
//        }
//        return prev;
//    }

//    public static Bogi middleBogi(Bogi head) {
//        Bogi slowP =  head;
//        Bogi fastP = head;
//
//        while(fastP != null && fastP.porerBogi != null) {
//            slowP = slowP.porerBogi;
//            fastP = fastP.porerBogi.porerBogi;
//        }
//        return slowP;
//    }

    public static void main(String[] args) {
        Bogi head = new Bogi();

        Bogi ka = new Bogi("KA");
        Bogi kha = new Bogi("KHA");
        Bogi ga = new Bogi("GA");
        Bogi gha = new Bogi("GHA");
        Bogi omo = new Bogi("OMO");

        head.porerBogi = ka;

        ka.porerBogi = kha;
        kha.porerBogi = ga;
        ga.porerBogi = gha;
        gha.porerBogi = omo;
        omo.porerBogi = null;



        display(head);
        System.out.println("-------------");

//        Bogi midHead = middleBogi(head);
//        System.out.println("mid head: " + midHead.getName());

//        Bogi revHead = reverseLinkedList(head);
//        display(revHead);

    }
}
