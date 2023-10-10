package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator {

    /**
     * タスクの実行
     */
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
    	
    	   System.out.println("plusメソッドの引数が１つの場合： " + plus(10)); // Calculatorクラスのplus(int a)メソッドを呼び出し
    	    System.out.println("plusメソッドの引数が2つの場合： " + plus(10, 20)); // Calculatorクラスのplus(int a, int b)メソッドを呼び出し
    	    System.out.println("plusメソッドの引数が3つの場合：" + plus(30, 40, 30)); // Calculatorクラスのplus(int a, int b, int c)メソッドを呼び出し
    	}

    }