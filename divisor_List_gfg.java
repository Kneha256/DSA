class Solution {
    public static void print_divisors(int n) {
        List<Integer> divisor=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                divisor.add(i);
            if(n/i!=i){
                divisor.add(n/i);
            }
            }
        }Collections.sort(divisor);
        for(int div:divisor){
            System.out.print(div+" ");
        }
        
    }
}
