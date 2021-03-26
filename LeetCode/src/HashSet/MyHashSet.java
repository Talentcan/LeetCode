package HashSet;

public class MyHashSet {
    private int keys [];
    private int size;

    public MyHashSet(){

    }

    public MyHashSet(int capacity){
        keys = new int [capacity];
    }

    public void add(int key){
        if(size >= keys.length){  //自动扩容
            int []temp = new int [keys.length*2];
            System.arraycopy(keys,0,temp,0,keys.length);
            keys = temp;
        }
        boolean res = true;
        for (int i=0 ; i<size ; i++){
            if (keys[i] == key){
                res = false;
            }
        }
        if (res){
            keys[size++] = key;
        }
    }

    public boolean contains(int key){
        for (int i=0 ; i<size ; i++){
            if (keys[i] == key){
                return true;
            }
        }
        return false;
    }

    public int getValue(int i) {
        return keys[i];
    }

    public void remove(int key){
        int index = 0;
        for (int i=0 ; i<size ; i++){
            if (keys[i] == key){
                index = i;
            }
        }
        for (int i=index+1 ; i<size ; i++){
            keys[i-1] = keys[i];
        }
        size--;
    }

    public int Size(){
        return size;
    }
}
