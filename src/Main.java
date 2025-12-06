class Main {
    public static void main(String[] args) {
        int[] a = {3, 8, 12, 5, 9};

        linearSearch search = new linearSearch();
        int index = search.linearSearch(a, 5);

        System.out.println(index); // 3

        recursiveLinearSearch rec = new recursiveLinearSearch();
        index = rec.linearSearchRecursive(a,9,0);
        System.out.println(index); //4
    }
}
