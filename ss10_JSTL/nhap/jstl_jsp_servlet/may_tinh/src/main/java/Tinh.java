public class Tinh {
    public static double tinh(double soThuNhat, String phepTinh, double soThuHai) {
        switch (phepTinh) {
            case "+":
                return soThuNhat + soThuHai;
            case "-":
                return soThuNhat - soThuHai;
            case "*":
                return soThuNhat * soThuHai;
            case "/":
                if (soThuHai != 0) {
                    return soThuNhat / soThuHai;
                } else
                    throw new RuntimeException("mau so kho the bang 0");
            default: throw new RuntimeException();
        }
    }

}

