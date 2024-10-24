package HashMapImpl;

import StrategyDesignPattern_Solution.GoodsVehicle;
import StrategyDesignPattern_Solution.Vehicle;

public class HashMapDemo<K,V> {
	
	
	//step:1
	private static final int INITIAL_SIZE = 1 << 4; //16
	private static final int MAXIMUM_CAPACITY= 1 << 30;
	
    //Step:2
	public Entry[] hashTable;
	
	//Step:2 if no size define than it will assign by default to 16.
	public HashMapDemo() {
		hashTable = new Entry[INITIAL_SIZE];
	}
	//Step:3
	public HashMapDemo(int capacity) {
	  int tableSize = tableSizeFor(capacity);
	  hashTable= new Entry[tableSize];
	}

	private int tableSizeFor(int capacity) {
	int n = capacity-1;
	n |= n>>>1;
	n |= n>>>2;
	n |= n>>>4;
	n |= n>>>8;
	n |= n>>>16;
		return (n<8)? 1 : (n>= MAXIMUM_CAPACITY)?MAXIMUM_CAPACITY : n+1;
	}
	
class Entry<K,V>{
	
	public K key;
	public V value;
	public Entry next;
	
	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
}

public void put(K key, V value) {
	
	int hashCode = key.hashCode() % hashTable.length;
	Entry node  = hashTable[hashCode];
	
	if(node == null) {
		Entry newNode = new Entry(key,value);
		hashTable[hashCode] = newNode;
	}else {
		Entry previousNode = node;
		while(node !=null) {
			if(node.key == key) {
				node.value= value;
				return;
			}
			previousNode = node;
			node= node.next;
		}
		Entry newNode = new Entry(key, value);
		previousNode.next = newNode;
	}
	
}	
	public V get(K key) {
		
		int hashCode = key.hashCode() % hashTable.length;
		Entry node  = hashTable[hashCode];
		
		if(node != null) {
			if(node.key.equals(key))
			{
				return (V) node.value;
			}
			node = node.next;
		}
		return null;
	}
	

public static void main(String[] args) {
	HashMapDemo<Integer, String> map = new HashMapDemo<Integer, String>(7);
	map.put(1, "hi");
	
	String m = map.get(1);
	System.out.println(m);
	}
}