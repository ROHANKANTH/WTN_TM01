package com.wipro.eb.entity;

public abstract class connection {
	protected int pr;
	protected int cr;
	protected float[] slabs;
	connection(){}
	protected connection(int cr,int pr){
		this.cr=cr;
		this.pr=pr;
	}
	public abstract float computebill();

}
