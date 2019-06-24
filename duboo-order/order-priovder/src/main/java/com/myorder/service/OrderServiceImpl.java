package com.myorder.service;

import com.myorder.Dto.RequestDto;
import com.myorder.Dto.ResponseDto;
import org.springframework.stereotype.Service;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService{
    @Override
    public ResponseDto findOrder(RequestDto requestDto) {
        ResponseDto responseDto =new ResponseDto();

        responseDto.setCode("11111");
        responseDto.setMsg("sucess");
        return responseDto;
    }
}
