class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        double k, f;
        k = celsius + 273.15;
        f = celsius * 1.80 + 32;
        ans[0] = k;
        ans[1] = f;
        System.out.print("[");
        for(int i = 0; i < 2; i++){
            if(i == 1)
            System.out.print(+ ans[i] + "]");
            else
            System.out.print(+ ans[i] + ",");
        }
        return ans;
    }
}