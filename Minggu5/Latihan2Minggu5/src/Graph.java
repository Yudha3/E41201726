





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    
    private Stack theStack;
    
    //BFS
    private Queue theQueue;
    
    public void bfs(){
        System.out.print("Visit by using" + " BFS algorithm : ");
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theQueue.insert(0);
        
        int v2;
        
        while(!theQueue.isEmpty()){
            int v1 = (int) theQueue.remove();
            while ((v2 = getAdjUnvisitedVertex(v1))!= -1){
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theQueue.insert(v2);
            }
        }
        System.out.println("");
        resetFlags();
    }
    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for(int i = 0; i < MAX_VERTS; i++){
            for(int j = 0; j < MAX_VERTS; j++){
                adjMat[i][j] = 0;
            }
        }
        
        //DFS
        //thisStack = new Stack(MAX_VERTS);
        theStack = new Stack(MAX_VERTS);
        theQueue = new Queue(MAX_VERTS);
    }
    
    public void addVertex(char label){
        vertexList[nVerts++] = new Vertex(label);
    }
    
    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    
    public void display(){
        System.out.println("Adjecency");
        for(int row = 0; row < nVerts; row++){
            for(int col = 0; col < row; col++){
                if(adjMat[row][col] == 1){
                    System.out.println(vertexList[row].label + " -- " + vertexList[col].label);
                }
            }
        }
        System.out.println("");
    }
    
    public void displayVertex(int v){
        System.out.print(vertexList[v].label + " ");
    }
    
    public int getAdjUnvisitedVertex(int v){
        for(int i = 0; i < nVerts; i++){
            if(adjMat[v][i] == 1 && vertexList[i].wasVisited == false){
                return i;
            }
        }
        return -1;
    }
    
    private void resetFlags(){
        for(int i = 0; i < nVerts; i++){
            vertexList[i].wasVisited = false;
        }
    }
    void dfs() {
        System.out.print("Visit by using" + " DFS algorithm : ");
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);
        
        while(!theStack.isEmpty()) {
            int v = getAdjUnvisitedVertex((int) theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }
        System.out.println("");
        resetFlags();
        
        /*
        System.out.print("Visit by using" + " BFS algorithm : ");
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);
        
        int v2;
        
        while(!theStack.isEmpty()){
            int v1 = (int) theStack.pop();
            while ((v2 = getAdjUnvisitedVertex(v1))!= -1){
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theStack.push(v2);
            }
        }
        System.out.println("");
        resetFlags();
        */
        /*
        System.out.print("Visit by using" + " DFS algorithm : ");
        
        boolean visited[] = new boolean[vertexList.length];
        Stack<Integer> stack = new Stack<Integer>();
        int awal = 0;//vertex A
        int akhir = 4;//vertex E
        
        visited [awal]=true;
        theStack.push(awal);
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
        }*//*
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
        }*/
    }
}



    


