package programfilm;

/**
 * @author Abhinaya
 */

public class Node {
    int id;
    String judul;
    double rating;
    Node next;
    Node prev;
    public Film film;
    
    public Node(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
