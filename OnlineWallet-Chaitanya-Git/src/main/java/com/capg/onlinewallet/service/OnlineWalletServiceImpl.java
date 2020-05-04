package com.capg.onlinewallet.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.onlinewallet.entities.TransferBean;

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
	
    /* updates the wallet and continues to dao layer*/
	@Override
	public OnlineWallet updateOnlineWallet(OnlineWallet onlinewalletbean) {
		// TODO Auto-generated method stub
		return dao.updateOnlineWallet(onlinewalletbean);
	}
	
    /* shows all the details of the wallets by findallWallets method*/
	@Override
	public List<OnlineWallet> findAllOnlineWallets() {
		// TODO Auto-generated method stub
		return dao.findAllOnlineWallets();
	}
	
    /* transfers the amount from one id to another through the deposit method*/
	@Override
	public OnlineWallet deposit(TransferBean transferBean) {
		// TODO Auto-generated method stub
		//return dao.fundTransfer(customerId1, customerId2, amount);
		return dao.deposit(transferBean);
	}
	@Override
	public OnlineWallet addAmount(int customerId, int amount) {
		// TODO Auto-generated method stub
		return dao.addAmount(customerId, amount);
	}
}
