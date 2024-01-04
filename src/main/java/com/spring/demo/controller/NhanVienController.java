package com.spring.demo.controller;

import com.spring.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String getNhanVien() {
        return "Tạo thành công";
    }
}
