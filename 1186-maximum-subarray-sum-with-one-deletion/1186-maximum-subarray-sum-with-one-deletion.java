class Solution {
    public int maximumSum(int[] arr) {
        int onedelete = arr[0];
        int nodelete = arr[0];
        int res = arr[0];

        for(int i = 1; i < arr.length; i++){
            int prevOnedelete = onedelete; 
            int prevNodelete = nodelete;

            nodelete = Math.max(arr[i], prevNodelete + arr[i]);
            onedelete = Math.max(prevNodelete, prevOnedelete + arr[i]);

            res = Math.max(res, Math.max(onedelete, nodelete));
        }
        return res;
    }
}