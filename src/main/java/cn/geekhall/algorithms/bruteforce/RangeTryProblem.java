package cn.geekhall.algorithms.bruteforce;

/**
 * 范围上尝试的模型
 *
 * 给定一个整型数组arr，代表数值不同的纸牌排成一条线，
 * 玩家A和玩家B依次拿走每张纸牌，
 * 规定玩家A先拿，玩家B后拿，
 * 但是每个玩家每次只能拿走最左或最右的纸牌，
 * 玩家A和玩家B都绝顶聪明。请返回最后获胜者的分数。
 */
public class RangeTryProblem {

    /**
     *
     * @param arr 分数牌
     * @return 获胜者的分数
     */
    public static int win(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        return Math.max(first(arr, 0, arr.length - 1), second(arr, 0, arr.length - 1));
    }

    /**
     * 取得先手情况下的最大分数。
     * @param arr   分数牌
     * @param left  左边位置
     * @param right 右边位置
     * @return  先手情况下的最大分数
     */
    private static int first(int[] arr, int left, int right) {
        if (arr == null || arr.length == 0) return 0;
        if (left == right) return arr[left];

        int pickLeft = arr[left] + second(arr, left + 1, right);
        int pickRight = arr[right] + second(arr, left, right - 1);
        return Math.max(pickLeft, pickRight);
    }

    /**
     * 取得后手情况下的最小分数。
     * @param arr   分数牌
     * @param left  左边位置
     * @param right 右边位置
     * @return  后手情况下的最小分数
     */
    private static int second(int[] arr, int left, int right) {
        if (arr == null || arr.length == 0) return 0;
        if (left == right) return 0;

        // 左边被选走后剩余部分的先手最大分数
        int pickLeft = first(arr, left + 1, right);
        // 右边边被选走后剩余部分的先手最大分数
        int pickRight = first(arr, left, right - 1);

        return Math.min(pickLeft, pickRight);
    }
}
