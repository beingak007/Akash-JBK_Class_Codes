package com.associations.has.a.relation;

public class Branch {

	// dependent object
	private String bid;
	private String bloc;

	public Branch(String bid, String bloc) {

		this.bid = bid;
		this.bloc = bloc;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBloc() {
		return bloc;
	}

	public void setBloc(String bloc) {
		this.bloc = bloc;
	}

}
