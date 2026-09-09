class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    private HashMap<Integer,Node>map;
    private int capacity;
    private Node head;
    private Node tail;


    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
        
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        remove(node);
        addtotail(node);
        return node.value;
        
    }

    
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            remove(node);
            addtotail(node);
            return;
        }
        Node node=new Node(key,value);
        map.put(key,node);
        addtotail(node);
        if(map.size()>capacity){
            Node lru=head.next;
            remove(lru);
            map.remove(lru.key);
        }



        
    }

    private void remove(Node node){
        Node prevnode=node.prev;
        Node nextn=node.next;
        prevnode.next=nextn;
        nextn.prev=prevnode;
    }
    private void addtotail(Node node){
        Node prev=tail.prev;
        
        prev.next=node;
        node.prev=prev;
        node.next=tail;
        tail.prev=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */