package com.spring.demo.service;

import com.spring.demo.dto.NhanVienDTO;
import com.spring.demo.entity.NhanVien;
import com.spring.demo.repo.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @created: 04/01/2024 - 10:25 PM
 * @author: dungna
 */
@Service
public class NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    public Integer addNhanVien(NhanVienDTO nhanVienDTO) {

        NhanVien nhanVienEntity = new NhanVien();
        System.out.println("In ra thông tin của nhanVienDTO: ");
        System.out.println(nhanVienDTO.getTen());
        System.out.println(nhanVienDTO.getTuoi());
        System.out.println(nhanVienDTO.getChucVu());
        System.out.println(nhanVienDTO.getDiaChi());
        System.out.println(nhanVienDTO.getMucLuong());

        nhanVienEntity.setTen(nhanVienDTO.getTen());
        nhanVienEntity.setTuoi(nhanVienDTO.getTuoi());
        nhanVienEntity.setChucVu(nhanVienDTO.getChucVu());
        nhanVienEntity.setDiaChi(nhanVienDTO.getDiaChi());
        nhanVienEntity.setMucLuong(nhanVienDTO.getMucLuong());

        //// CRUD: CREATE, READ, UPDATE, DELETE
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

        Optional<NhanVien> entity = nhanVienRepository.findById(id);

        if (entity.isPresent()) {
            NhanVien nhanVien = entity.get();
            result.setTen(nhanVien.getTen());
            result.setChucVu(nhanVien.getChucVu());
            result.setTuoi(nhanVien.getTuoi());
            result.setDiaChi(nhanVien.getDiaChi());
            result.setMucLuong(nhanVien.getMucLuong());

        }

        return result;
    }

    public List<NhanVienDTO> getAllNhanVien() {

        List<NhanVienDTO> listNhanVienDTO = new ArrayList<>();
        List<NhanVien> listNhanVienEntity = new ArrayList<>();

        listNhanVienEntity = nhanVienRepository.findAll();

        if (listNhanVienEntity.size() > 0) {
            // Thực hiện chuyển đổi list Entity về list DTO cho giao diện
            for(NhanVien entity : listNhanVienEntity) {
                NhanVienDTO dto = new NhanVienDTO();

                dto.setTen(entity.getTen());
                dto.setChucVu(entity.getChucVu());
                dto.setTuoi(entity.getTuoi());
                dto.setDiaChi(entity.getDiaChi());
                dto.setMucLuong(entity.getMucLuong());

                listNhanVienDTO.add(dto);
            }
        }
        return listNhanVienDTO;
    }

    public String updateNhanVien(Integer id) {

        Optional<NhanVien> entity = nhanVienRepository.findById(id);
        if (entity.isPresent()) {
            NhanVien nhanVien = entity.get();
            nhanVien.setTen("Nguyễn Văn B");
            nhanVien.setTuoi(19);

            nhanVienRepository.save(nhanVien);

        } else {
            return "Không có dữ liệu";
        }
        return "Cập thông tin thành công.";
    }

    public String deleteNhanVien(Integer id) {
        Optional<NhanVien> entity = nhanVienRepository.findById(id);
        if (entity.isPresent()) {
            NhanVien nhanVien = entity.get();
            nhanVienRepository.delete(nhanVien);

        } else {
            return "Không có dữ liệu";
        }
        return "Xóa bản ghi thành công.";
    }


}
