import java.util.LinkedList;

public class ListContainer {

    public int getListSize(int a, int b){
        LinkedList linkedList = new LinkedList();
        if(a!=-1)
            linkedList.add(a);
        if(b!=-1)
            linkedList.add(b);
        return linkedList.size();
    }
}
