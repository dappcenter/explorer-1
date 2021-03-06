package io.trxplorer.api.dto.account;

import java.sql.Timestamp;

import io.trxplorer.api.utils.TransactionHelper;

public class VoteDTO {

	private String from;
	
	private String to;
	
	private String voteAddress;
	
	private Long voteCount;
	
	private Timestamp timestamp;
	
	public String getVoteAddress() {
		return voteAddress;
	}

	public void setVoteAddress(String voteAddress) {
		this.voteAddress = voteAddress;
	}

	public Long getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(Long voteCount) {
		this.voteCount = voteCount;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getVoteCountStr() {
		return TransactionHelper.getTrxAmount(voteCount);
	}
	
}
