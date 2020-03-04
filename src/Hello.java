
import java.io.File;
import java.util.Random;

public class Hello {
    public static int[] getRandomArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] newBubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        return array;
    }

    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;

            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                end = mid - 1;
            }
            if (array[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }

    enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }

    public static void catFile(File file, int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());
        if (file.isDirectory()) {
            deep++;
            for (File dFile : file.listFiles()
            ) {
                catFile(dFile, deep);
            }

        }

    }

    public static void main(String[] args) {
        File files = new File("E:\\尚学堂2018人工智能视频教程\\01_人工智能开发及远景介绍（预科）【尚学堂·百战程序员】");
        catFile(files, 0);
//        System.out.println(Arrays.toString(file.listFiles()));

    }
}
