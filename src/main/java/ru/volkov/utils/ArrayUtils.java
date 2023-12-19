package ru.volkov.utils;

public class ArrayUtils {

    /**
     * Return the index of a rotated point in the array. If the array hasn't a pivot point, then return -1
     * @param rotatedArr
     * @return
     */
    public static int getRotatedIndex(int[] rotatedArr) {

        int status = -1;

        if (rotatedArr[0] < rotatedArr[rotatedArr.length - 1]) {
            return status;
        }

        int left = 0;
        int right = rotatedArr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (rotatedArr[mid] > rotatedArr[mid + 1] && rotatedArr[0] > rotatedArr[mid + 1]) {
                status = mid;
                break;
            } else if (rotatedArr[mid] < rotatedArr[mid + 1] && rotatedArr[0] > rotatedArr[mid + 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return status;
    }
}
