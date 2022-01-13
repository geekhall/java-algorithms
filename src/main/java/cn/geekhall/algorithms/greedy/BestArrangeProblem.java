package cn.geekhall.algorithms.greedy;

import cn.geekhall.datastructures.linkedlist.Problems;

/**
 * 安排会议室使得举行会议场次最多。
 * 要求：同一时间只能安排同一场会议。
 */
public class BestArrangeProblem {
    /**
     * 会议对象
     */
    public static class Program{
        public int start;
        public int end;
        public Program(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    /**
     * 安排会议室使得举行会议场次最多。
     * @param programs 会议
     * @return 可以安排的会议场次
     */
    public static int bestArrange(Program[] programs) {
        if (programs == null || programs.length == 0) return 0;
        return process(programs, 0, 0);
    }

    /**
     * 目前来到timeline时间点，已经安排了done这么多会会议。
     * 返回能安排的最多会议数量
     * @param programs 还剩什么会议
     * @param done     之前已经安排过的会议数量
     * @param timeLine 目前来到时间点
     * @return 能安排的最多会议数量
     */
    public static int process(Program[] programs, int done, int timeLine) {
        if (programs.length == 0) return done;
        int max = done; // 还有会议可以选择
        for (int i = 0; i < programs.length; i++) {
            if (programs[i].start >= timeLine) {
                Program[] next = copyButExcept(programs, i);
                max = Math.max(max, process(next, done + 1, programs[i].end));
            }
        }
        return max;
    }

    /**
     * 复制源数组programs中除第i个元素以外的所有元素，返回复制后的新数组。
     *
     * @param programs 源数组
     * @param i        要排除的元素索引值
     * @return         排除后的数组
     */
    public static Program[] copyButExcept(Program[] programs, int i) {
        Program[] ans = new Program[programs.length - 1];
        int index = 0;
        for (int k = 0; k < programs.length; k ++) {
            if (k != i) {
                ans[index++] = programs[k];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Program[] programs = {
                new Program(8,10),
                new Program(9,11),
                new Program(12,15),
                new Program(13,14),
                new Program(15,16),
                new Program(8,12),
                new Program(9,10),
                new Program(10,11)
        };
        System.out.println(bestArrange(programs));
    }
}
