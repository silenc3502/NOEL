package com.kh.myapp.market.model.vo;

import java.util.ArrayList;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductVO {
	private int prdNo;
	private String cateGory;
	private String prdName;
	private String prdPrice;
	private int prdStock;
	private String prdNote;
	private String prdTel;
	private String prdAddr1;
	private String prdAddr2;
	private String prdContent;
	private Date regDate;
	private ArrayList<ProductImgVO> prdImgList;
	private String prdthumNail;
	private String marketerId;
}
