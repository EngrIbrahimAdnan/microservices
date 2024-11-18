package com.example.demo.service;

import com.example.demo.bo.CreateStockRequest;
import com.example.demo.bo.UpdateStockResponse;

public interface StockService {

    UpdateStockResponse updateStock(CreateStockRequest request);

    void addItems(CreateStockRequest stock);
}