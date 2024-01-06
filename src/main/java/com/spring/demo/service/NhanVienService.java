package com.spring.demo.service;

import com.spring.demo.dto.NhanVienDTO;
import com.spring.demo.entity.NhanVien;
import com.spring.demo.repo.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @created: 04/01/2024 - 10:25 PM
 * @author: dungna
 */
@Service
public class NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    public Integer addNhanVien(NhanVienDTO nhanVienInput) {

        NhanVien nhanVienEntity = new NhanVien();
        nhanVienEntity.setTen(nhanVienInput.getTen());
        nhanVienEntity.setTuoi(nhanVienInput.getTuoi());
        nhanVienEntity.setChucVu(nhanVienInput.getChucVu());
        nhanVienEntity.setDiaChi(nhanVienInput.getDiaChi());
        nhanVienEntity.setMucLuong(nhanVienInput.getMucLuong());

        System.out.println("In ra thông tin của nhanVienEntity: ");
        System.out.println(nhanVienEntity.getTen());
        System.out.println(nhanVienEntity.getTuoi());
        System.out.println(nhanVienEntity.getChucVu());
        System.out.println(nhanVienEntity.getDiaChi());
        System.out.println(nhanVienEntity.getMucLuong());

        nhanVienRepository.save(nhanVienEntity);
        if (nhanVienEntity.getId() != null) {
            return nhanVienEntity.getId();
        } else {
            return -1;
        }
    }

    public NhanVienDTO getInfoNhanVien(Integer id) {
        NhanVienDTO result = new NhanVienDTO();
        NhanVien entity = new NhanVien();

        entity = nhanVienRepository.getById(id);
        if (entity.getId() != null) {
            result.setTen(entity.getTen());
            result.setChucVu(entity.getChucVu());
            result.setTuoi(entity.getTuoi());
            result.setDiaChi(entity.getDiaChi());
            result.setMucLuong(entity.getMucLuong());
        }

        return result;
    }
}
