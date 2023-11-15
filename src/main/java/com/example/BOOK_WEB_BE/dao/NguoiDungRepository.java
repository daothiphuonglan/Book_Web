package com.example.BOOK_WEB_BE.dao;

import com.example.BOOK_WEB_BE.entity.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="nguoi-dung")
public interface NguoiDungRepository extends JpaRepository<NguoiDung,Integer> {
      boolean existsByTenDangNhap(String tenDangNhap);

      boolean existsByEmail(String email);
}
