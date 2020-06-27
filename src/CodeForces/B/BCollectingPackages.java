package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Collecting Packages
 *
 * link : https://codeforces.com/problemset/problem/1294/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class BCollectingPackages {
    class pair{
        int x, y;

        public pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    class Compare{
        pair[] compare(pair[] arr, int size) {

            Arrays.sort(arr, new Comparator<pair>() {
                @Override
                public int compare(pair o1, pair o2) {
                    return o1.y- o2.y;
                }
            });
            return arr;
        }
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int t = in.nextInt();

        while (t-->0){
            StringBuilder sb = new StringBuilder();
            int n = in.nextInt();
            int a ;
            int b ;
            boolean flag = true;
            pair[] arr = new pair[n];
            for (int i = 0; i < n; i++) {
                a =  in.nextInt();
                b =  in.nextInt();
                arr[i] = new pair(a, b);
            }
            int x = 0, y = 0;
            Compare cm = new Compare();
            arr = cm.compare(arr, n);
            pair robot = new pair(0,0);

            for (int i = 0; i <n ; i++) {
                if (robot.x > arr[i].x || robot.y > arr[i].y){
                    flag = false;
                    break;
                }

                for (int j = robot.x; j < arr[i].x; j++) {
                    sb.append("R");
                    robot.x++;
                }

                for (int j = robot.y; j < arr[i].y; j++) {
                    sb.append("U");
                    robot.y++;
                }
            }
            if (flag){
                out.println("YES");
                out.println(sb.toString());
            }
            else
                out.println("NO");
        }
    }
}
