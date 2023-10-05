/**
 * Task1-5 : 課題内容
 *
 * 本課題では、ルーブ文に記述に慣れていきましょう。
 * 問①〜問④まであります。
 * for文・while文の仕組みを意識しながらコーディングしていきましょう！
 */
public class Task1_5 {

    public static void main(String[] args) {

        // ① 「みかん」、「りんご」、「ぶどう」、「メロン」の値を設定した配列 fruits を作成してください。
        String[] fruits = { "みかん", "りんご", "ぶどう", "メロン" };

        // ② for文を使って①で作成した配列を出力しなさい。
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // ③ 以下のwhile文の処理について、何をしているのかコメントを記入してください。
        /*
         * [整数iに１を代入。iが100より小さければ、iを表示。iに1づつプラスして100になるまで繰り返す]
         */
        int i = 1;
        while (i <= 100) {
            System.out.print(i);
            i++;
        }
        System.out.println();

        /*
         * ④ 行の最初に「段数」と「||」を追加したものを表示させるプログラムを作成しなさい。
         * 1 || 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
         * 2 || 2 | 4 | 6 | 8 | 10 | 12 | 14 | 16 | 18 |
         * 3 || 3 | 6 | 9 | 12 | 15 | 18 | 21 | 24 | 27 |
         * 4 || 4 | 8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 |
         * 5 || 5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 |
         * 6 || 6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 |
         * 7 || 7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 |
         * 8 || 8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 |
         * 9 || 9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 |
         */
        int rows = 9;// 九九の段

        // 九九の段を生成して表示
        for (int n = 1; n <= rows; n++) {
            System.out.println(n + " || ");

            for (int j = 1; j <= 9; j++) {
                int result = n * j;
                System.out.println(result + " | ");
            }
        }
    }
}
