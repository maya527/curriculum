/**
 * バブルソート
 * チェックテスト-Java2章
 *
 */
public class Check {
    public static void main(String[] args) {
        /*
         * 問1
         * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
         */
        int[] data = { 3, 1, 2, 7, 5 };

        /*
         * 問2
         * 以下のfor文を完成させなさい
         */
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < data.length - 1; i++) { // -1 することでインデックスが範囲内になる
            for (int j = 0; j < data.length - i - 1; j++) { // -1 および -i することで範囲内になる
                /*
                 * 問3
                 * 以下、配列の添字を入れてソートを完成させなさい
                 */
                if (data[j] > data[j + 1]) { // 正しい添字を使用して修正
                    int box = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = box;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
