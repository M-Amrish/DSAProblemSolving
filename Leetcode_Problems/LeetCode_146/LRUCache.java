package Leetcode_Problems.LeetCode_146;

import java.util.HashMap;

public class LRUCache {

    class Node{

        public int val;
        int key;
        Node next;
        Node prev;

        Node(int k, int x){

            this.key = k;
            this.val = x;
            next = prev = null;
        }
    }

    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    int capacity = 0;

    HashMap<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(map.containsKey(key) == false){
            return -1;
        }else{
            Node temp = map.get(key);

            map.remove(temp);
            removeNode(temp);

            Node newNode = new Node(temp.key, temp.val);

            insertBack(newNode);
            map.put(key, newNode);

            return temp.val;
        }
    }

    public void put(int key, int value) {


        if(map.containsKey(key)){
            Node node = map.get(key);

            map.remove(key);
            removeNode(node);

        }else{

            if(map.size() == capacity ){

                map.remove(head.next.key);
                removeNode(head.next);

            }
        }

        Node newNode = new Node(key, value);
        insertBack(newNode);
        map.put(key, newNode);
    }

    public void insertBack(Node nn){

        Node temp = tail.prev;

        temp.next = nn;
        tail.prev = nn;

        nn.next = tail;
        nn.prev = temp;


    }

    public void removeNode(Node node){

        node.prev.next = node.next;
        node.next.prev = node.prev;

    }
}
