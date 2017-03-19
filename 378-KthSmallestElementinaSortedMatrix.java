/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @USe priorityQueue.
 */
public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row = k < matrix.length? k: matrix.length;
        int column = k < matrix[0].length? k: matrix[0].length;
        Queue<Integer> pqueue = new PriorityQueue<Integer>(new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                return (o2 - o1);
            }
        });
        for(int i = 0;i < row;i++){
            for(int j = 0;j < column;j++){
                if(pqueue.size() == k){
                    if(matrix[i][j] <= pqueue.peek()){
                        pqueue.remove(pqueue.peek());
                        pqueue.add(matrix[i][j]);
                    }
                    else{
                        column = j + 1;
                    }
                }
                else if(pqueue.size() < k){
                    pqueue.add(matrix[i][j]);
                }
            }
        }
        return pqueue.peek();
    }
}
