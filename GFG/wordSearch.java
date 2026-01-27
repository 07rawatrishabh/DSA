class Solution {
    int dx[]={-1,0,1,0,-1};
    public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int n=mat.length;
        int m= mat[0].length;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==word.charAt(0)){
                    visited[i][j]=true;
                    if(dfs(mat,word,i,j,0,visited))return true;
                    visited[i][j]=false;
                }
            }
        }
        return false;
        
    }
    public boolean dfs(char mat[][],String word,int i,int j,int idx,boolean visited[][]){
        if(idx==word.length()-1&&mat[i][j]==word.charAt(idx))return true;
        for(int k=0;k<4;k++){
           if(i+dx[k]>=0&&j+dx[k+1]>=0&&i+dx[k]<mat.length&&j+dx[k+1]<mat[0].length&&mat[i+dx[k]][j+dx[k+1]]==word.charAt(idx+1)&&!visited[i+dx[k]][j+dx[k+1]]){
            visited[i+dx[k]][j+dx[k+1]]=true;
            if(dfs(mat,word,i+dx[k],j+dx[k+1],idx+1,visited))return true;
            visited[i+dx[k]][j+dx[k+1]]=false;
           }
        }
      
        return false;
    }
}