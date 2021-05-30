public class ListFromArray{
    int[] theArray;
    static final int slot = 5;

    public ListFromArray(){
        theArray = new int[slot];
    }

    public int find(int value){
        if(theArray == null) return - 1;
        for (int i = 0; i < theArray.length; i++){
           if(theArray[i] == value) return i;
        }
        return -1;
    }

    public int findKth(int kthPosition) throws Exception{
        if(theArray == null 
        || kthPosition < 0 || kthPosition > theArray.length-1){
            throws new Exception();
        }
        return theArray[kthPosition];
    }

    public void insert(int value, int position) {
        if(theArray == null) {
            if(position != 0) return;
            else {
                theArray = new int[1];
                theArray[0] = value;
                return;
            }
        }
        if(position < 0 || position > theArray.length-1) return;
        int[] c = new int[theArray.length+1];
        for(int i = 0; i < theArray.length; i++){
            c[i] = theArray[i];
        }
        theArray = c;
        for(int i = theArray.length-1; i >= 0; i--) {
            if(i > position) theArray[i] = theArray[i-1];
            else {
                theArray[i] = value;
                return;
            }
        }

        public void remove(int value) {
            int i;
            if(theArray == null) return;
            for(i = 0; i < theArray.length; i++) {
                if(theArray[i] == value) break;
            }
            if(i >= theArray.length) return;
            if(theArray.length == 1) {
                theArray = null;
                return;
            }
            for(i = 0; i < theArray.length - 1; i++) {
                theArray[i] = theArray[i + 1];
            }
            
        }
    }
}   