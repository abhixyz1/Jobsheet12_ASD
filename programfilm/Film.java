package programfilm;

/**
 * @author Abhinaya
 */

public class Film {
    Node head;
    Node tail;
    int rating;

    public Film() {
        this.head = null;
        this.tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int id, String judul, double rating) {
        Node newNode = new Node(id, judul, rating);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(int id, String judul, double rating) {
        Node newNode = new Node(id, judul, rating);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAt(int id, String judul, double rating, int index) {
        if (index < 0) {
            System.out.println("Indeks tidak boleh negatif");
        } else if (index == 0) {
            addFirst(id, judul, rating);
        } else {
            Node newNode = new Node(id, judul, rating);
            Node current = head;
            int i = 0;
            while (i < index - 1 && current.next != null) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                System.out.println("Indeks melebihi batas");
            } else {
                newNode.next = current.next;
                newNode.prev = current;
                current.next.prev = newNode;
                current.next = newNode;
            }
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else if (index < 0) {
            System.out.println("Indeks tidak boleh negatif");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index && current.next != null) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                System.out.println("Indeks melebihi batas");
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }

    void cetak() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println("=====================================");
                System.out.println("ID\t: " + current.id);
                System.out.println("Judul\t: " + current.judul);
                System.out.println("Rating\t: " + current.rating);
                current = current.next;
            }
            System.out.println();
        }
    }

    int cari(int id) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.id == id) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    void cariData(int id) {
        Node current = head;
        while (current != null) {
            if (current.id == id) {
                System.out.println("=====================================");
                System.out.println("ID\t " + current.id);
                System.out.println("Judul\t: " + current.judul);
                System.out.println("Rating\t: " + current.rating);
                System.out.println("=====================================");
            }
            System.out.println();
            current = current.next;
        }
    }

    double getRating() {
        return rating;
    }

    void urutkanData() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node current = head, index = null;
            int tempId;
            String tempJudul;
            double tempRating;
    
            while (current != null) {
                index = current.next;
    
                while (index != null) {
                    if (current.rating < index.rating) {
                        tempId = current.id;
                        tempJudul = current.judul;
                        tempRating = current.rating;
    
                        current.id = index.id;
                        current.judul = index.judul;
                        current.rating = index.rating;
    
                        index.id = tempId;
                        index.judul = tempJudul;
                        index.rating = tempRating;
                    }
    
                    index = index.next;
                }
    
                current = current.next;
            }
        }
    }
}
