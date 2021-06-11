package com.wipro.eb.service;

import com.wipro.eb.entity.commercial;
import com.wipro.eb.entity.domestic;
import com.wipro.eb.exception.ICE;
import com.wipro.eb.exception.IRE;

public class connectionservice {
	public boolean validate(int cr,int pr,String type)throws IRE,ICE
	{
		boolean valid=true;
		if(cr<pr || cr<0 || pr<0)
		{
			valid=false;
			throw new IRE();
		}
		if(!(type.equalsIgnoreCase("commercial") || type.equalsIgnoreCase("domestic")))
		{
			valid=false;
			throw new ICE();
		}
		return valid;
	}
	public float calculatebillamount(int cr,int pr,String type)
	{
		float result=0;
		try
		{
		if(this.validate(cr,pr,type))
		{

			if(type.equalsIgnoreCase("commercial"))
			{
				commercial c=new commercial(cr,pr);
				return c.computebill();
			}
			else
			{
				domestic c= new domestic(cr,pr);
				return c.computebill();
			}
		}
	}
		catch(IRE ire)
		{
			result=-1;
		}
		catch(ICE ice)
		{
			result=-2;
		}
		return result;
	}
	
	public String generatebill(int cr,int pr,String type)
	{
		float result=this.calculatebillamount(cr, pr, type);
		if(result==-1)
			return String.format("Incorrect Reading");
		 if(result==-2)
			return String.format(("Inavlid connection Type"));
		return (String.format("Amount to be paid : %.2f",result));
		
		
	}

}

