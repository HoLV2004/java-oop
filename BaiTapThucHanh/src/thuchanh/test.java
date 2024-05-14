package thuchanh;

import model.util.configs;

public class test {
    public static void main(String[] args) {

        nvfulltime sep = new nvfulltime("le sep");
        sep.loaichucvu(configs.nv_sep);
        nvfulltime ducdat = new nvfulltime("duc dat");
        nvfulltime vietanh = new nvfulltime("viet anh", 20);
        nvpartime pt = new nvpartime(" huu duc ", 200);
        sep.tinhluong();
        ducdat.tinhluong();
        vietanh.tinhluong();
        pt.tinhluong();

        sep.inthongtin();
        ducdat.inthongtin();
        vietanh.inthongtin();
        pt.inthongtin();
    }
}