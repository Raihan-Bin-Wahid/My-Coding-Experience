package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Epic Game
 *
 * link : https://codeforces.com/problemset/problem/119/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AEpicGame {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        if((n&1) == 0)
            out.println(1);
        else
            out.println(0);
    }
}
