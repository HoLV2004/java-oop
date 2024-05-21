package thuchanh;

import model.util.configs;

public class nvparttime extends nhanvien {
    private int giolamviec;

    public nvparttime(String ten, int giolamviec) {
        this.ten = ten;
        this.giolamviec = giolamviec;
    }

    @Override

    public String loainhanvien() {
        return " Nhan vien thoi vu";
    }

    public void tinhluong() {
        luong = configs.luong_partime * giolamviec;
    }

}