public class main {
    char[] label = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
    double[][] matriks = {
        {0, 1, 2, 3, 4, 5, 6, 7, 8},
        {1, 2, 3, 4, 5, 6, 7, 8, 9},
        {2, 3, 4, 5, 6, 7, 8, 9, 10},
        {3, 4, 5, 6, 7, 8, 9, 10, 11},
        {4, 5, 6, 7, 8, 9, 10, 11, 12},
        {5, 6, 7, 8, 9, 10, 11, 12, 13},
        {6, 7, 8, 9, 10, 11, 12, 13, 14},
        {7, 8, 9, 10, 11, 12, 13, 14, 15},
        {8, 9, 10, 11, 12, 13, 14, 15, 16},
    };
    
    System.out.print("Visit by using" + " DFS algorithm : ");
        
        boolean visited[] = new boolean[label.length];
        Stack<Integer> stack = new Stack<Integer>();
        int start = 0;//vertex A
        int akhir = 4;//vertex E
        
        visited [awal]=true;
        Stack.push(awal);
        displayVertex(awal);
        boolean selesai=false;
        
        while(!theStack.isEmpty()){
            int v =(int) theStack.peek();
            if (v==akhir){
                selesai=true;
                break;
            } else {
                int VertexTujuan=-1;
                for(int i=0; i < adjMat[v].length; i++){
                    double bobot=adjMat [v][i];
                    boolean isVisited=visited[i];
                    if(bobot>0 && !isVisited){
                        VertexTujuan=i;
                        break;
                    }
                }
                if(VertexTujuan !=-1){
                    theStack.push(VertexTujuan);
                    visited[VertexTujuan]= true;
                } else {
                    theStack.pop();
                }
            }
        }
        if(selesai && !theStack.isEmpty()) {
            System.out.println("path: " +vertexList[awal]);
            double total=0;
            for(int i=1; i<theStack.size(); i++){
                int va=(int) theStack.get(i-1);
                int vb=(int) theStack.get(i);
                double bobot=adjMat[va][vb];
                total += bobot;
                System.out.print("-"+vertexList[vb]);
            }
            System.out.println("\nTotal Jarak :"+total);
        }
    
}
