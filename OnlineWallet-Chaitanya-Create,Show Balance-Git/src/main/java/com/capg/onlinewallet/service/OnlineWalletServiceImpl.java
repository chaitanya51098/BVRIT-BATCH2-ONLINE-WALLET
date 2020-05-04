package com.capg.onlinewallet.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.onlinewallet.dao.IOnlineWalletDao;
import com.capg.onlinewallet.entities.OnlineWallet;

@Service

public class OnlineWalletServiceImpl implements IOnlineWalletService{
	@Autowired
	
	private IOnlineWalletDao dao;
    /* Creates the onlinewallet bean by taking the onlinewalletBean*/
	@Override
	public OnlineWallet CreateOnlineWallet(OnlineWallet onlinewalletbean) {
		// TODO Auto-generated method stub
		return dao.CreateOnlineWallet(onlinewalletbean);
	}
	
   /* shows the wallet of particular id*/
	@Override
	public OnlineWallet findOnlineWalletById(int customerId) {
		// TODO Auto-generated method stub
		return dao.findOnlineWalletById(customerId);
	}
	
}
