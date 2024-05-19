package com.example.Sage_PFE.repository;

import com.example.Sage_PFE.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
    Optional<UserInfo> findByEmail(String email);
}
