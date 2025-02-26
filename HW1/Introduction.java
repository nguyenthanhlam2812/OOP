public class Introduction {
    public static void main(String[] args) {
        System.out.println("Họ Tên: Nguyễn Thành Lâm");
        System.out.println("Mã Sinh Viên: 24022378");
        System.out.println("Lớp: K69A-AI2");
        System.out.println("GitHub Username: nguyenthanhlam2812");
        System.out.println("Email: 24022378@vnu,edu,vn");

        System.out.println();

        for (int i = 9; i > 0; i--) {
            if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down, pass it around,");
                System.out.println((i - 1) + " bottles of beer on the wall.\n");
            } else {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                System.out.println("Take one down, pass it around,");
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}
