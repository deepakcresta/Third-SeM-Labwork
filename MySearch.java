public class MySearch {

    /*
    optionsa
    1. 1-9   X
    2. 0
    3. 0-5   X
    4. 0-9   X
    
     */
    int a[] = {23, 45, 67, 43, 55, 78, 98, 58, 22};

    public MySearch() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
    }

    public void search(int s) {
        int i = 0;

        System.out.println("");
        for (i = 0; i < a.length; i++) {
            if (a[i] == s) {
                break;
            }
        }
        if (a.length == i) {
            System.out.println("Not Found: " + s);
        } else {
            System.out.println("Found: " + s + " at position: " + i);
        }
    }

    public static void main(String[] args) {
        MySearch ms = new MySearch();
        ms.search(5);
        ms.search(22);
        ms.search(23);
    }

}