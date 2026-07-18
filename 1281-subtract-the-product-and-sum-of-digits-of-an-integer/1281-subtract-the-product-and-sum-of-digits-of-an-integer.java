class Solution {
    public int subtractProductAndSum(int n) {
        int productOfDigitsOfN = findProduct(n);
        int sumOfDigitsOfN = findSum(n);
        return productOfDigitsOfN - sumOfDigitsOfN;
    }

    public int findProduct(int n) {
        int product = 1;
        while(n > 0) {
            int digit = n % 10;
            product = product * digit;
            n = n / 10;
        }
        return product;
    }

    public int findSum(int n) {
        int sum = 0;
        while(n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        return sum;
    }
}