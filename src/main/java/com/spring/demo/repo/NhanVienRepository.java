package com.spring.demo.repo;

import com.spring.demo.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @created: 04/01/2024 - 10:19 PM
 * @author: dungna
 */
@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, Integer> {
}
