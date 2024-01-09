package com.spring.demo.controller;

import com.spring.demo.dto.NhanVienDTO;
import com.spring.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @created: 04/01/2024 - 10:23 PM
 * @author: dungna
 */
@RestController
@RequestMapping("/nhan-vien")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/get-all-nhan-vien")
    public List<NhanVienDTO> getNhanVien() {
        List<NhanVienDTO> kq = new ArrayList<>();
        kq = nhanVienService.getAllNhanVien();
        return kq;
    }

    // Done CREATE
    @PostMapping("/add-nhan-vien")
    public Integer addNhanVien(@RequestBody NhanVienDTO nhanVienInput) {
        Integer ketQua = nhanVienService.addNhanVien(nhanVienInput);
        return ketQua;
    }

    @GetMapping("/info-nhan-vien")
    public NhanVienDTO getInfoNhanVien(@RequestParam Integer id) {
        NhanVienDTO result = new NhanVienDTO();
        result = nhanVienService.getInfoNhanVien(id);
        return result;
    }

    @PutMapping("/update-nhan-vien")
    public String updateNhanVien(@RequestParam Integer id) {
        String result = nhanVienService.updateNhanVien(id);
        return result;
    }

    @DeleteMapping("/delete-nhan-vien")
    public String deleteNhanVien(@RequestParam Integer id) {
        String result = nhanVienService.deleteNhanVien(id);
        return result;
    }

}
