package programvaksin;

/**
 * @author Abhinaya
 */

public class Node {
    int nomorAntrian;
    String nama;
    Node prev;
    Node next;

    public Node(int nomorAntrian, String nama) {
        this.nomorAntrian = nomorAntrian;
        this.nama = nama;
        this.next = null;
        this.prev = null;
    }
}
