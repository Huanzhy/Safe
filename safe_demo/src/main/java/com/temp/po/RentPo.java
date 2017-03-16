package com.temp.po;

import java.util.Date;

public class RentPo extends Po {
	
	private int boxId;
	
	private String cardRfid;
	
	private String cardNo;
	
	private int rentId;
	
	private int certificateId;
	
	private String rentRemark;
	
	private String certificateRemark;
	
	private int rentType;
	
	private Date startDate;
	
	private Date endDate;
	
	private float rentDiscount;

	private float actualRent;
	
	private int paymentType;
	
	private float feeTotal;
	
	private int accountId;
	
	public RentPo() {}

	@Override
	public String toString() {
		return "RentPo [boxId=" + boxId + ", cardRfid=" + cardRfid + ", cardNo=" + cardNo + ", rentId=" + rentId
				+ ", certificateId=" + certificateId + ", rentRemark=" + rentRemark + ", certificateRemark="
				+ certificateRemark + ", rentType=" + rentType + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", rentDiscount=" + rentDiscount + ", actualRent=" + actualRent + ", paymentType=" + paymentType
				+ ", feeTotal=" + feeTotal + ", accountId=" + accountId + "]";
	}

	public int getBoxId() {
		return boxId;
	}

	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}

	public String getCardRfid() {
		return cardRfid;
	}

	public void setCardRfid(String cardRfid) {
		this.cardRfid = cardRfid;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getRentId() {
		return rentId;
	}

	public void setRentId(int rentId) {
		this.rentId = rentId;
	}

	public int getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}

	public String getRentRemark() {
		return rentRemark;
	}

	public void setRentRemark(String rentRemark) {
		this.rentRemark = rentRemark;
	}

	public String getCertificateRemark() {
		return certificateRemark;
	}

	public void setCertificateRemark(String certificateRemark) {
		this.certificateRemark = certificateRemark;
	}

	public int getRentType() {
		return rentType;
	}

	public void setRentType(int rentType) {
		this.rentType = rentType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public float getRentDiscount() {
		return rentDiscount;
	}

	public void setRentDiscount(float rentDiscount) {
		this.rentDiscount = rentDiscount;
	}

	public float getActualRent() {
		return actualRent;
	}

	public void setActualRent(float actualRent) {
		this.actualRent = actualRent;
	}

	public int getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

	public float getFeeTotal() {
		return feeTotal;
	}

	public void setFeeTotal(float feeTotal) {
		this.feeTotal = feeTotal;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

}