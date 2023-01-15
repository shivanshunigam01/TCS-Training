import java.util.Stack;
public class Shortest_path_count {

    int count=0;
    public void findPaths(int[][] mat, Stack<Integer> path, int i, int j)
    {

        if (mat == null || mat.length == 0) {
            return;
        }

        int M = mat.length;
        int N = mat[0].length;


        if (i == M - 1 && j == N - 1)
        {
            path.add(mat[i][j]);
            System.out.println(path);
            path.pop();
            count++;
            return;
        }


        path.add(mat[i][j]);

        // move right
        if ((i >= 0 && i < M && j + 1 >= 0 && j + 1 < N)) {
            findPaths(mat, path, i, j + 1);



        }

        // move down
        if ((i + 1 >= 0 && i + 1 < M && j >= 0 && j < N)) {
            findPaths(mat, path, i + 1, j);
            
        }


        path.pop();
    }
    public void rev(){
        System.out.println("Total number of Paths will be::"+count);
    }

    public static void main(String[] args)
    {
        int[][] mat =
                {
                        { 10, 11, 12 },
                        { 13, 14, 15 },
                        { 16, 17, 18 }
                };

        Stack<Integer> path = new Stack<>();

        // start from `(0, 0)` cell
        int x = 0, y = 0;
        Shortest_path_count ob=new Shortest_path_count();
        ob.findPaths(mat, path, x, y);
        ob.rev();

    }

}