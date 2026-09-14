package HashMap;

import java.util.*;

public class hashMap {
    public class HashMap<K,V> { // K,V are generics used when data tpye is not Known
        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; //no of nodes
        private int N; // no of bucket
        private LinkedList<Node>[] buckets;

        public HashMap() {
            this.N = 4;
            buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFun(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        public V get(K key) {
            int bi = hashFun(key);
            int di = searchLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFun(key);
            int di = searchLL(key, bi);
            if (di != -1) {
                return true;
            }
            return false;
        }

        public V removeKey(K key) {
            int bi = hashFun(key);
            int di = searchLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public ArrayList<K> keyList(K key) {
            int bi = hashFun(key);
            int di = searchLL(key, bi);
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    keys.add(ll.get(j).key);
                }
            }
            return keys;
        }

        private void reHash(){
            LinkedList<Node>[] oldBuckets = buckets;
            N *= 2;
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
            n = 0;
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashFun(key); // bucket Index
            int di = searchLL(key,bi);
            if(di == -1){
                buckets[bi].add(new Node(key,value));
                n++;
            }else{
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double) n/N;
            if(lambda>2.0){
                reHash();
            }
        }
    }
    public static void main(String[] args){
        hashMap outer = new hashMap();
        hashMap.HashMap<String, Integer> map = outer.new HashMap<>();
        map.put("india",190);
        map.put("USA",26);
        map.put("China",200);
        System.out.println(map.get("india"));
        System.out.println(map.containsKey("africa"));
        System.out.println(map.keyList("india"));
        System.out.println(map.isEmpty());
        System.out.println(map.removeKey("USA"));
        System.out.println(map.keyList(""));
        ArrayList<String> key = map.keyList("");
        for (int i = 0; i < key.size(); i++) {
            System.out.println(key.get(i)+" "+map.get(key.get(i)));
        }
    }
}
