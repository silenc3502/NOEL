package com.kh.myapp.order.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderVO {
 
	private int cartNo;
	private int prdNo;
	private int cartQuan;
	private String prdthumNail;
	private String prdName;
	private String prdPrice;
	private int orderPrice;
	private int orderNo;
	private String userId;
	private String orderDate;
	private int orderQuan;
	private String orderStatus;
	private String shippingAddr1;
	private String shippingAddr2;
	private String shippingPhone;
	private String impUid;
	
	
}
