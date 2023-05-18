package com.multi.gazee.member;



//RAM에 만드는 저장공간을 만든다.
public class OrderVO {
	// MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	// 각 컬럼과 일치시켜 줌.
	private int orderId;
	private String type;
	private int productId;
	private String sellerId;
	private String buyerId;
	private int sellerConfirm;
	private int buyerConfirm;
	private int status;
	private int paid;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public int getSellerConfirm() {
		return sellerConfirm;
	}
	public void setSellerConfirm(int sellerConfirm) {
		this.sellerConfirm = sellerConfirm;
	}
	public int getBuyerConfirm() {
		return buyerConfirm;
	}
	public void setBuyerConfirm(int buyerConfirm) {
		this.buyerConfirm = buyerConfirm;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPaid() {
		return paid;
	}
	public void setPaid(int paid) {
		this.paid = paid;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "OrderVO [orderId=" + orderId + ", type=" + type + ", productId=" + productId + ", sellerId=" + sellerId
				+ ", buyerId=" + buyerId + ", sellerConfirm=" + sellerConfirm + ", buyerConfirm=" + buyerConfirm
				+ ", status=" + status + ", paid=" + paid + "]";
	}
	
	
	
	
	
	
	
	
}
