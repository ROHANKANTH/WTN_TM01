package com.wipro.eb.entity;

public class commercial extends connection {
	public static final float[] slabs= {5.2f,6.8f,8.3f};
	public commercial(int cr,int pr)
	{
		super(cr,pr);
	}
	public float computebill()
	{
		int units=cr-pr;
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
		if(billamount>=10000) {
				return billamount*1.09f;
		}
		else if(billamount>=5000) {
			return billamount*1.06f;
		}
		else {
			return billamount*1.02f;
		}
	}

}

