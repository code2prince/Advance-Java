package Practice.JavaConcept;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private final int capacity;
    private final Map<Integer,Node> map;
    private final Node head,tail;

    public LRUCache(int capacity){
        this.capacity=capacity;
        this.map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }


    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);
        remove(node);
        insertAtHead(node);

        return node.value;
    }


    public void put(int key, int value){
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            remove(node);
            insertAtHead(node);
        }else{
            if(map.size()==capacity){
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode=new Node(key,value);
            map.put(key,newNode);
            insertAtHead(newNode);
        }
    }

    public void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public void insertAtHead(Node node){
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }



    public static void main(String[] args) {
        LRUCache cache=new LRUCache(2);
        cache.put(1,10);
        cache.put(2,20);
        System.out.println(cache.get(1));
        cache.put(3,30);
        System.out.println(cache.get(2));
        cache.put(4,40);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
