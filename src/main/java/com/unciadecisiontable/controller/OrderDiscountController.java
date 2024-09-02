package com.unciadecisiontable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unciadecisiontable.model.OrderDiscount;
import com.unciadecisiontable.model.OrderRequest;
import com.unciadecisiontable.service.OrderDiscountService;

@RestController()
@RequestMapping("/ruleservice")
public class OrderDiscountController {

//	@Autowired
//	 private OrderDiscountService orderDiscountService;
//	 
//	 @PostMapping("/getDiscount")
//	 public ResponseEntity<OrderDiscount> getDiscount(@RequestBody OrderRequest orderRequest){
//	  OrderDiscount discount = orderDiscountService.getDiscount(orderRequest);
//	  return new ResponseEntity<>(discount, HttpStatus.OK);
//	 }
	
    @Autowired
    private OrderDiscountService orderDiscountService;
 
    @PostMapping("/get-discount")
    public ResponseEntity<OrderDiscount> getDiscount(@RequestBody OrderRequest orderRequest) {
        OrderDiscount discount = orderDiscountService.getDiscount(orderRequest);
        return new ResponseEntity<>(discount, HttpStatus.OK);
    }
}
