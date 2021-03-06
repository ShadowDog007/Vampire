package com.massivecraft.vampire.cmd;

import com.massivecraft.mcore5.cmd.req.ReqHasPerm;
import com.massivecraft.mcore5.cmd.req.ReqIsPlayer;
import com.massivecraft.vampire.VPerm;

public class CmdAccept extends VCommand
{
	public CmdAccept()
	{
		this.addAliases("a", "accept");
		
		this.addRequirements(ReqHasPerm.get(VPerm.TRADE_ACCEPT.node));
		this.addRequirements(ReqIsPlayer.get());
	}
	
	@Override
	public void perform()
	{
		vme.tradeAccept();
	}
}
