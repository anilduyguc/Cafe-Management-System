package com.kenobi.cafe.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface BillService {
    public ResponseEntity<String> generateReport(Map<String, Object> requestMap);
}
