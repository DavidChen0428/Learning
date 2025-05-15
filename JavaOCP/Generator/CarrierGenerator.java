import java.util.Random;

public class CarrierGenerator {
    // 定義可用的字元集：數字、大寫字母，加號、減號和點號
    // 注意這裡串列中直接列出字元，避免正則表達式中 '-' 的範圍含義問題
    private static final String ALLOWED_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ+-.";
    // 後續要生成的載具代碼固定長度為7（扣除開頭的 '/'）
    private static final int ID_LENGTH = 7;
    // 這裡用 Random 物件產生隨機數，你也可以使用 SecureRandom 提高安全性
    private static final Random RANDOM = new Random();

    /**
     * 生成一個隨機載具代碼，格式為 "/" 後面接 7 個 ALLOWED_CHARS 中的字元。
     *
     * @return 符合格式要求的載具代碼，例如 "/A1+9Z-."
     */
    public static String generateCarrierId() {
        // 使用 StringBuilder 來累積字元，提高運算效能
        StringBuilder carrierId = new StringBuilder(ID_LENGTH + 1);
        // 第一個字元固定為 '/'
        carrierId.append('/');

        // 連續加入 7 個隨機字元
        for (int i = 0; i < ID_LENGTH; i++) {
            int index = RANDOM.nextInt(ALLOWED_CHARS.length());
            carrierId.append(ALLOWED_CHARS.charAt(index));
        }

        return carrierId.toString();
    }

    public static void main(String[] args) {
        // 測試生成載具代碼
        String id = generateCarrierId();
        System.out.println("生成的載具代碼：" + id);
    }
}
