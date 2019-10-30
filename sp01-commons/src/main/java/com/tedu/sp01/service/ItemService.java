package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/** 通过订单id获得商品列表 */
	List<Item> getItems(String orderId);
	/** 保存订单时减少商品库存 */
	void decreaseNumbers(List<Item> list);
}