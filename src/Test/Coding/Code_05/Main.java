package Test.Coding.Code_05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int maxDancePairs(int[] boysSkills, int[] girlsSkills) {

        // 对男孩和女孩的舞蹈技巧进行排序
        Arrays.sort(boysSkills);
        Arrays.sort(girlsSkills);

        int boysIndex = boysSkills.length - 1; // 男孩索引
        int girlsIndex = girlsSkills.length - 1; // 女孩索引（从技巧最高的开始）
        int pairs = 0; // 配对成功的舞伴数量

        while (boysIndex >= 0 && girlsIndex >= 0) {
            // 如果男孩和女孩的舞蹈技巧相差不超过1
            if (Math.abs(boysSkills[boysIndex] - girlsSkills[girlsIndex]) <= 1) {
                pairs++; // 配对成功
                boysIndex--; // 尝试下一个男孩
                girlsIndex--; // 尝试下一个女孩
            } else if (boysSkills[boysIndex] < girlsSkills[girlsIndex]) {
                // 如果男孩的技巧太低，尝试下一个男孩
                boysIndex--;
            } else {
                // 如果女孩的技巧太低，尝试下一个女孩
                girlsIndex--;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] boysSkills = new int[n];
        for(int i = 0;i < n ;i++) {
            boysSkills[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] girlsSkills = new int[m];

        for(int i = 0;i < m ;i++) {
            girlsSkills[i] = scan.nextInt();
        }
        // 示例输入


        // 调用函数并输出结果
        int maxPairs = maxDancePairs(boysSkills, girlsSkills);
        System.out.println(maxPairs);
    }
}
