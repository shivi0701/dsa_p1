import java.util.*;

public class MyGraph {
    Map<Integer, LinkedList<Integer>> obj= new HashMap<>();
    public void addedge(int v1,int v2, boolean bidirectional){
        LinkedList<Integer> vneighbour = obj.getOrDefault(v1,new LinkedList<>());
        vneighbour.add(v2);
        obj.put(v1,vneighbour);
        if(bidirectional==true){
            LinkedList<Integer> v1neighbour =obj.getOrDefault(v2,new LinkedList<>());
            v1neighbour.add(v1);
            obj.put(v2,v1neighbour);
        }
    }
    public void bfstraversal(int source){
        Queue<Integer>bfs= new LinkedList<>();
        bfs.add(source);
        Set<Integer> vis= new HashSet<>();
        vis.add(source);
        while (!bfs.isEmpty()){
            int front= bfs.poll();
            System.out.println(front);
            LinkedList<Integer> neighbourlist=obj.get(front);
            for (int res:neighbourlist){
                if(!vis.contains(res)){
                    bfs.add(res);
                    vis.add(res);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        MyGraph obj= new MyGraph();
        obj.addedge(1,2,true);
        obj.addedge(2,4,true);
        obj.addedge(1,3,true);
        obj.addedge(3,4,true);
        obj.addedge(3,5,true);
        obj.addedge(5,6,true);
        obj.bfstraversal(1);
    }
}
