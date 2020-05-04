package com.capg.onlinewallet.service;
import java.util.List;

import com.capg.onlinewallet.entities.OnlineWallet;

public interface IOnlineWalletService {

	public OnlineWallet CreateOnlineWallet(OnlineWallet onlinewalletbean);
    
	public OnlineWallet findOnlineWalletById(int customerId);
	
	
}
