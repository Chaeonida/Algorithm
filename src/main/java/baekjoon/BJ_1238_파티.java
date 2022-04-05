//package baekjoon;
//
//import java.io.*;
//import java.util.*;
//
//class Edge implements Comparable<Edge> {
//    public int vex;
//    public int cost;
//
//    Edge(int vex, int cost) {
//        this.vex = vex;
//        this.cost = cost;
//    }
//
//    @Override
//    public int compareTo(Edge ob) {
//        return this.cost - ob.cost;
//    }
//}
//
//public class BJ_1238_파티 {
//    static int n, m, x;
//    static ArrayList<ArrayList<Edge>> true_graph, reverse_graph;
//    static int[] dis1;
//    static int[] dis2;
//
//    public void solution(int v, int[] dis, ArrayList<ArrayList<Edge>> graph) {
//        PriorityQueue<Edge> pQ = new PriorityQueue<>();
//        pQ.offer(new Edge(v, 0));
//        dis[v] = 0;
//        while (!pQ.isEmpty()) {
//            Edge tmp = pQ.poll();
//            int now = tmp.vex;
//            int nowCost = tmp.cost;
//            if (nowCost > dis[now]) continue;
//            for (Edge ob : graph.get(now)) {
//                if (dis[ob.vex] > nowCost + ob.cost) {
//                    dis[ob.vex] = nowCost + ob.cost;
//                    pQ.offer(new Edge(ob.vex, nowCost + ob.cost));
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        BJ_1238_파티 T = new BJ_1238_파티();
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//        x = Integer.parseInt(st.nextToken());
//
//        true_graph = new ArrayList<ArrayList<Edge>>();
//        reverse_graph = new ArrayList<ArrayList<Edge>>();
//        for (int i = 0; i <= n; i++) {
//            true_graph.add(new ArrayList<Edge>());
//            reverse_graph.add(new ArrayList<Edge>());
//        }
//        dis1 = new int[n + 1];
//        dis2 = new int[n + 1];
//        Arrays.fill(dis1, Integer.MAX_VALUE);
//        Arrays.fill(dis2, Integer.MAX_VALUE);
//
//        for (int i = 0; i < m; i++) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            int c = Integer.parseInt(st.nextToken());
//            true_graph.get(a).add(new Edge(b, c));
//            reverse_graph.get(b).add(new Edge(a, c));
//        }
//
//        T.solution(x,dis1,true_graph);
//        T.solution(x,dis2,reverse_graph);
//
//        int answer = Integer.MIN_VALUE;
//        for (int i = 0; i < n + 1; i++) {
//            answer = Math.max(answer, dis2[i]+ dis1[i]);
//        }
//
//
//
//        System.out.println(answer);
//    }
//}
