public class OrderedSuperArray extends SuperArray{

	public OrderedSuperArray(){
		super();
	}
	public OrderedSuperArray(int capacity){
		super(capacity);
	}
	public OrderedSuperArray(int[] ary){
		super(2*ary.length);
		for(int i = 0; i < ary.length; i++){
			add(ary[i]);
		}
	}
	public int set(int index, int element){
	    int result = get(index);
		remove(index);
		add(element);
		return result;
	}

	public int binarySearch(int value, int minbound, int maxbound) {
    	if (minbound > maxbound){
            return -1;
        }
        int middle = (minbound + maxbound) / 2;
        if (get(middle) == value){
            return middle;
        }
        if (get(middle) > value){
            return binarySearch(value, minbound, middle - 1);
        }else{
            return binarySearch(value, middle + 1, maxbound);
        }
	}

	public boolean add(int value){
		int index = binarySearch(value, 0, size());
		super.add(index, value);
		return true;
	}
	
	public void add(int index, int element){
		throw new UnsupportedOperationException();
	}
}