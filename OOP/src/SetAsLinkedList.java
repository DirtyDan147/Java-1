public class SetAsLinkedList<T> implements Set<T> {
    //fields
    private List<T> linkedList;

    //constructors
    public SetAsLinkedList(){
        linkedList = new LinkedList<T>();
    }

    //copy constructor
    public SetAsLinkedList(Set<T> other){
        linkedList = new LinkedList<T>();
        Iterator<T> otherIterator = other.iterator();
        while (otherIterator.hasNext())
            add(otherIterator.next());
    }

    //methods
    public Iterator<T> iterator() {
        return linkedList.iterator();
    }

    public int size() {
        return linkedList.size();
    }

    public boolean add(T element) {
        if (linkedList.contains(element))
            return false;
        linkedList.add(element);
        return true;
    }

    public boolean contains(T element) {
        return linkedList.contains(element);
    }

    public boolean remove(T element) {
        return remove(element);
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public boolean equals(Object other){
        if (!(other instanceof SetAsLinkedList<?> || ((SetAsLinkedList<?>) other).size() != size()))
            return false;
        Iterator<T> iterator = iterator();
        Iterator<?> otherIterator = ((LinkedList<?>) other).iterator();
        while (iterator.hasNext())
            if (!iterator.next().equals(otherIterator.next()))
                return false;
        return true;
    }
}
