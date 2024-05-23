package programvaksin;

/**
 * @author Abhinaya
 */

public class Vaksin {
    Node head;
    int size;
    
    public Vaksin() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    void Enqueue(int nomorAntrian, String nama) {
        if (isEmpty()) {
            head = new Node(nomorAntrian, nama);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(nomorAntrian, nama);
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    void Dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Node temp = head;
            System.out.println(temp.nama + " telah selesai divaksinasi");
            head = head.next;
            if (head != null) {
                head.prev = null;
                System.out.println("--------------------------------------");
                System.out.println("Daftar Pengantri Vaksin");
                System.out.println("--------------------------------------");
                System.out.println("Nomor Antrian\tNama");
                System.out.println("--------------------------------------");
                Node current = head;
                while (current != null) {
                    System.out.println(current.nomorAntrian + "\t\t" + current.nama);
                    current = current.next;
                }
                System.out.println("Sisa antrian : " + (size - 1));
                System.out.println();
            }
        }
    }

    void cetak() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("--------------------------------------");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("--------------------------------------");
            System.out.println("Nomor Antrian\tNama");
            System.out.println("--------------------------------------");
            Node current = head;
            while (current != null) {
                System.out.println(current.nomorAntrian + "\t\t" + current.nama);
                current = current.next;
            }
            System.out.println("--------------------------------------");
            System.out.println();
        }
    }

}
