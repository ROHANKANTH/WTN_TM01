package com.wipro.eb.entity;

public class domestic extends connection {
	
	public static final float[] slabs= {2.3f,4.2f,5.5f};

	public domestic(int cr,int pr)
	{
		super(cr,pr);
	}
	public float computebill()
	{
		int units=this.cr-this.pr;
		float billamount=0.0f;
		if(units>100) {
			billamount=50*slabs[0]+50*slabs[1]+(units-100)*slabs[2];
		}
		else if(units>50) {
			billamount=50*slabs[0]+(units-50)*slabs[1];
		}
		else {
			billamount=units*slabs[0];
		}
		return billamount;
	}
}
