
interface Collection<E> extends Iterable<E> {
}

interface Set<E> extends Collection<E> {
    //if obj1.equals(obj2) then only one of them can be in the set
    //Unique things only- does not allow duplication
}

interface List<E> extends Collection<E> {
}

interface Queue<E> extends Collection <E> {
}


interface Map<K,V> {
}

class ArrayList {/* implements List<E>, randomaccess 
//implements randomAccess, meaning it support fast almost constant time access
//Insertion and deletion are slower compared to Linkedlist */
}

class Vector {/* implements List<E>, randomaccess 
//Thread safe - Synchronised methods
// supports almost constant time access
} */ }

class LinkedList {
//Elements are doubly linked - forward and backward to one another
//Ideal choice to implement stack or queue
//iteration is slower than arraylist
//Fast insertion and deletion
//Implements Queue interface
//Supports peek(), poll(), remove()
//poll() method retrieves and removes the head of the queue, or returns null if the queue is empty. This is commonly used in concurrent and blocking queues in the java.util.concurrent package.
}

interface SortedSet<E> extends Set<E> {
    //maintains elements in sorted order
}


interface NavigableSet<E> extends SortedSet<E> {
    //A sortedset extended with navigation methods to help you report closest matches
}

//ANYTHING WITH HASH, IS UNORDERED!!!!!!!!!!!

class HashSet //implements Set
{
    //unordered, unsorted-iterates in random order
    //uses hashCode()
    //order of insertion: A,X,B
    //Possible order of storing: X,A,B
}

class LinkedListHashSet //implements Set
{
    //unordered, unsorted-iterates in random order
    //uses hashCode()
    //order of insertion: A,X,B
    //Possible order of storing: A,X,B
}

class TreeSet { //implements NavigableSet
    //3,5,7
    //sorted-natural order
    //implements NavigableSet
    //No Duplicates, Sorted in Natural Order
    //Order of Insertion: A,C,B
    //Order of Storing: A,B,C
}

interface SortedMap<K, V> extends Map<K, V> { //Map that orders based on keys
	Comparator<? super K> comparator();

	SortedMap<K, V> subMap(K fromKey, K toKey);

	SortedMap<K, V> headMap(K toKey);

	SortedMap<K, V> tailMap(K fromKey);

	K firstKey();

	K lastKey();
}

//A SortedMap extended with navigation methods reporting closest matches for given search targets.
interface NavigableMap<K, V> extends SortedMap<K, V> {
}

class HashMap /* implements Map */{
	// unsorted, unordered
	// key's hashCode() is used
}

class Hashtable /* implements Map */{
	// Synchronized - Thread Safe - version of HashMap
	// unsorted, unordered
	// key's hashCode() is used
	// HashMap allows a key with null value. Hashtable doesn't.
}

class LinkedHashMap /* implements Map */{
	// insertion order is maintained (optionally can maintain access order as
	// well)
	// slower insertion and deletion
	// faster iteration
}

// A,C,B
// A,B,C
class TreeMap /* implements Map,NavigableMap */{
	// sorted order is maintained
	// implements NavigableMap
}

//Support operations that wait until the space from the queue becomes AVAILABLE
//A Queue that additionally supports operations that wait for 
//the queue to become non-empty when retrieving an
//element, and wait for space to become available in the queue when
//storing an element.
interface BlockingQueue<E> extends Queue<E> {
	//Same as in Queue Interface
	//Inserts the specified element into queue IMMEDIATELY 
	//Throws exception in case of failure	
	boolean add(E e);

	//Same as in Queue Interface
	//Inserts the specified element into queue IMMEDIATELY 
	//Returns false in case of failure	
	boolean offer(E e); //Same as in Queue Interface

	//Inserts the specified element into this queue, waiting 
	//if necessary for space to become available.
	void put(E e) throws InterruptedException;

	//waiting up to the specified wait time
	boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException;

	//waits until element becomes available
	E take() throws InterruptedException;

	//waits for specified time and returns null if time expires
	E poll(long timeout, TimeUnit unit) throws InterruptedException;

	int remainingCapacity();

	boolean remove(Object o);

	public boolean contains(Object o);

	int drainTo(Collection<? super E> c);

	int drainTo(Collection<? super E> c, int maxElements);
}

//The elements of the priority queue are ordered 
//according to their natural ordering
class PriorityQueue /* implements Queue */{
	// sorted - natural order
}

class ArrayDeque /*implements Deque*/{

}

class ArrayBlockingQueue /*implements BlockingQueue*/{
	//uses Array - optionally-bounded
}

class LinkedBlockingQueue /*implements BlockingQueue*/{
	//uses Linked List - optionally-bounded
	//Linked queues typically have higher throughput than array-based queues but
	//less predictable performance in most concurrent applications.
}

//A linear collection that supports element INSERTION AND REMOVAL FROM BOTH ENDS****
interface Deque<E> extends Queue<E> {
	void addFirst(E e);

	void addLast(E e);

	boolean offerFirst(E e);

	boolean offerLast(E e);

	E removeFirst();

	E removeLast();

	E pollFirst();

	E pollLast();

	E getFirst();

	E getLast();

	E peekFirst();

	E peekLast();

	boolean removeFirstOccurrence(Object o);

	boolean removeLastOccurrence(Object o);

}


// COLLECTION EXAMPLES
public class CollectionExamples {
    public static void main(String[] args){
        List<Integer> integers = new ArrayList<Integer>
        integers.add(5)
        int i;
        int a[]={1,2,3,4,5};
        List<String> batsman=new ArrayList<String>();
        batsman.add("Lala");
        batsman.add("popo");
        batsman.add("Davido");
        batsman.add(0, "Gogo");
        batsman.add("Meepo");
        System.out.println(batsman.size());
        System.out.println(batsman.contains("Drogo"));
    }
}