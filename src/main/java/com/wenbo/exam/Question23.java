package com.wenbo.exam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liwenbo
 * @date: 2021-09-28 18:12:25
 * @desc: 服务器连接方式包括直接相连，间接连接。A和B直接连接，B和C直接连接，则
 * A和C间接连接。直接连接和间接连接都可以发送广播。
 * 给出一个N*N数组，代表N个服务器，matrix[]i]== 1,则代表i和j直接连接;不
 * 等于1时，代表和j不直接连接。matrix[][i] == 1,即自己和自己直接连接。
 * matrix[)]0] == matrix[]li]。
 * 计算初始需要给几台服务器广播，才可以使每个服务器都收到广播。
 * 输入描述:
 * 输入为N行，每行有N个数字，为0或1，由空格分隔，构成N*N的数组，N的范
 * 围为1<=N<=40
 */
public class Question23 {
    public static void main(String[] args) {
        List<Node> nodeList = new ArrayList();
        List<List<Node>> nodeGroup = new ArrayList();
        int[][] positionArr = {{1, 0, 0}, {1, 0, 0}, {0, 0, 1}};
        for (int i = 0; i < positionArr.length; i++) {
            for (int j = 0; j < positionArr[i].length; j++) {
                if (positionArr[i][j] == 1) {
                    nodeList.add(new Node(i, j));
                }
            }
        }
        System.out.println(getNodeGroup(nodeList));
        System.out.println(positionArr.length);
        System.out.println(nodeList);
    }

    private static List<List<Node>> getNodeGroup(List<Node> nodeList) {
        for (int i = 0; i < nodeList.size(); i++) {
            Node node = nodeList.get(i);

        }
        return null;
    }

    static class Node {
        int row;
        int collum;

        public Node(int row, int collum) {
            this.row = row;
            this.collum = collum;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "row=" + row +
                    ", collum=" + collum +
                    '}';
        }
    }
}
