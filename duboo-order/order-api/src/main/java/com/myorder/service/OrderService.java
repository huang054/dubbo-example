package com.myorder.service;

import com.myorder.Dto.RequestDto;
import com.myorder.Dto.ResponseDto;

public interface OrderService {
    public ResponseDto findOrder(RequestDto requestDto);
}
