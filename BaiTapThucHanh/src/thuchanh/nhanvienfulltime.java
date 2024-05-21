package thuchanh;

import model.util.configs;

public class nhanvienfulltime extends nhanvien {
    int ngaylamthem, chucvu;

    public nhanvienfulltimefulltime(String ten){
        super(ten);
    this.chucvu = Configs.nv_duc;
    }

    public nhanvienfulltime(String ten, int ngaylamthem) {
        super(ten);
        this.ngaylamthem = ngaylamthem;
        this.chucvu = Configs.nv_duc;
    }

    public void loaichucvu(int chucvu) {
        this.chucvu = chucvu;
    }

    public String loainhanvien() {
        if (chucvu == Configs.nv_duc) {
            return " duc fulltime";
        } else {
            return " sep ";
        }

    }

    public void tinhluong() {
        if (chucvu == Configs.nv_duc) {
            luong = Configs.luong_nv_fulltime_duc + ngaylamthem * Configs.luong_fulltime;
        } else if (chucvu == configs.nv_sep) {
            luong = Configs.luong_nv_fulltime_sep + ngaylamthem * Configs.luong_fulltime;
        }
    }
}