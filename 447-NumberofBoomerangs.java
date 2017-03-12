/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use hashmap to record all the distances and compare.
 */
public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        /*
        if(points == null || points.length < 3 || points[0].length == 0)
            return 0;
        int result = 0;
        for(int index1 = 0;index1 < points.length;index1++){
            for(int index2 = 0;index2 < points.length;index2++){
                if(index1 == index2)
                    continue;
                for(int index3 = 0;index3 < points.length;index3++){
                    if(index1 == index3 || index2 == index3)
                        continue;
                    if(dis(points[index1],points[index2]) == dis(points[index1],points[index3]) ){
                        result++;
                    }
                }
            }
            
        }
        return result;
        */
        if(points == null || points.length < 3 || points[0].length == 0)
            return 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int result = 0,dist = 0;
        for(int index1 = 0;index1 < points.length;index1++){
            for(int index2 = 0;index2 < points.length;index2++){
                if(index1 == index2)
                    continue;
                dist = dis(points[index1],points[index2]);
                map.put(dist,map.getOrDefault(dist,0) + 1);
            }
            for(int val: map.values()){
                result += val * (val - 1);
            }
            map.clear();
        }
        return result;
    }
    
    private int dis(int[] a,int[] b){
        return ((a[0] - b[0]) * (a[0] - b[0])) + ((a[1] - b[1]) * (a[1] - b[1]));
    }
    
}
