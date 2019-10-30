package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	/** 订单id */
	private String id;
	/** 订单所属用户 */
	private User user;
	/** 订单中包含商品 */
	private List<Item> items;
}