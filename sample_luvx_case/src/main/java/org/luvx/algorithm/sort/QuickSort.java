package org.luvx.algorithm.sort;

public class QuickSort {

    /**
     * 快速排序
     *
     * @param array 排序数组
     * @param left  排序范围起点
     * @param right 排序范围终点
     */
    public static void sort4(int[] array, int left, int right) {
        if (right <= left)
            return;// 只有0或1个记录,不需排序
        int pivot = partition2(array, left, right);
        sort4(array, left, pivot - 1);
        sort4(array, pivot + 1, right);
    }

    // 分割策略2
    public static int partition2(int[] array, int start, int end) {
        int pivot = array[start];
        int left = start, right = end;
        while (left <= right) {
            while (left <= right && array[left] <= pivot)
                left++;
            while (left <= right && array[right] > pivot)
                right--;
            if (left < right) {
                int temp = array[right];
                array[right] = array[left];
                array[left] = temp;
                left++;
                right--;
            }
        }
        int temp1 = array[start];
        array[start] = array[right];
        array[right] = temp1;
        return right;
    }

    // 分割策略1
    public static int partition1(int[] array, int left, int right) {
        int pivot = array[left];
        while (left < right) {
            while (left < right && array[right] > pivot)
                right--;
            array[left] = array[right];
            while (left < right && array[left] <= pivot)
                left++;
            array[right] = array[left];
        }
        array[left] = pivot;
        return left;
    }

    // 分割策略3:在策略1基础上减少了同一位置的赋值操作
    public static int partition3(int[] array, int left, int right) {
        int pivot = array[left];
        while (left < right) {
            while (left < right && array[right] > pivot)
                right--;
            if (left < right) {
                array[left] = array[right];
                left++;
            }
            while (left < right && array[left] <= pivot)
                left++;
            if (left < right) {
                array[right] = array[left];
                right--;
            }
        }
        array[left] = pivot;
        return left;
    }
}
