package com.myuser.service;

import com.myorder.Dto.RequestDto;
import com.myorder.Dto.ResponseDto;
import com.myorder.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class BootStarp {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("user-provider.xml");

        OrderService orderService = (OrderService) context.getBean("orderService");
        RequestDto requestDto = new RequestDto();
        requestDto.setName("hello");
        requestDto.setPasswworld("world");
        ResponseDto responseDto=orderService.findOrder(requestDto);
        System.out.println(responseDto);
    }
}
