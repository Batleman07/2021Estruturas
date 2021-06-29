package Trab_seg_bim;


public class ArrayList<T> implements List<T> {
	  // valor padrão para a capacidade do vetor.
    private final static int DEFAULT_CAPACITY = 100;

    protected int size;
    protected int capacity;
    protected T array[];

    public ArrayList(){
         this(DEFAULT_CAPACITY);
    }

    public ArrayList(int capacity){
        size = 0;
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }


    @Override
    public void addFirst(T value) {
        add(0,value);
    }

    @Override
    public void addLast(T value) {
        add(value);
    }

    @Override
    public T getFirst() {
        checkPosition(0);
        return get(0);
    }

    @Override
    public T getLast() {
        checkPosition(size()-1);
        return get(size()-1);
    }

    @Override
    public T removeFirst() {
        checkPosition(0);
        return remove(0);
    }

    @Override
    public T removeLast() {
        checkPosition(size()-1);
        return remove(size()-1);
    }

    /**
     * Adiciona um elemento no final da lista.
     * @param value
     */
    @Override
    public void add(T value) {
        array[size()] = value;
        size++;
    }

    @Override
    public void add(int position, T value) {
        checkPosition(position);
    }

    @Override
    public T get(int position) {
        checkPosition(position);
        return array[position];
    }

    @Override
    public T remove(int position) {
        checkPosition(position);
        return null;
    }

    @Override
    public T set(int position, T value) {
        checkPosition(position);
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        for(int i = 0; i < size(); i++){
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean contains(T value) {
        for(int i = 0; i < size(); i++){
            if(array[i] != null && array[i].equals(value)){
                return true;
            }
            if(array[i]  == null && value == null){
                return true;
            }
        }
        return false;
    }

    private void checkPosition(int position){
        if(position < 0 || position >= size())
            throw new IndexOutOfBoundsException("Posição ["+position+"] inválida para uma lista de tamanho ["+size()+"].");

    }


	
}//array = (T[]) new Object[capacity];
