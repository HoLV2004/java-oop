package thuchanh;

import model.util.configs;

public class nvfulltime extends nhanvien {
    int ngaylamthem, chucvu;

    public nvfulltime(String ten) {
        super(ten);
        this.chucvu = configs.nv_duc;
    }

    public nvfulltime(String ten, int ngaylamthem) {
        super(ten);
        this.ngaylamthem = ngaylamthem;
        this.chucvu = configs.nv_duc;
    }

    public void loaichucvu(int chucvu) {
        this.chucvu = chucvu;
    }

    public String loainhanvien() {
        if (chucvu == configs.nv_duc) {
            return " duc fulltime";
        } else {
            return " sep ";
        }

    }

    public void tinhluong() {
        if (chucvu == configs.nv_duc) {
            luong = configs.luong_nv_fulltime_duc + ngaylamthem * configs.luong_fulltime;
        } else if (chucvu == configs.nv_sep) {
            luong = configs.luong_nv_fulltime_sep + ngaylamthem * configs.luong_fulltime;
        }
    }
}