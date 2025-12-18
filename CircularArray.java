class CircularArray {
    int[] arr;
    int size;   // capacity
    int front = 0;
    int rear = -1;
    int count = 0;

    CircularArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    void add(int value) {
        if (count == size) {
            System.out.println("Array Is Full!");
            return;
        }
        rear = (rear + 1) % size;
        arr[rear] = value;
        count++;
    }

    void remove() {
        if (count == 0) {
            System.out.println("Not Remove!");
            return;
        }
        System.out.println("Removed: " + arr[front]);
        front = (front + 1) % size;
        count--;
    }

    void display() {
        if (count == 0) {
            System.out.println("Array Not Found!");
            return;
        }
        System.out.print("Numbers: ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % size;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    // SEARCH (kaliya tiro + index)
    void search(int key) {
        for (int i = 0; i < count; i++) {
            int index = (front + i) % size;
            if (arr[index] == key) {
                System.out.println("Found: " + key);
                System.out.println("Index: " + index);
                return;
            }
        }
        System.out.println("Not Found!");
    }
}