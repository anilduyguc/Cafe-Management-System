package com.kenobi.cafe.dao;

import com.kenobi.cafe.pojo.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillDao extends JpaRepository<Bill, Integer> {
}
